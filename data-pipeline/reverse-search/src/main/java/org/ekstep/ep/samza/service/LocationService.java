package org.ekstep.ep.samza.service;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;
import com.google.maps.model.LatLng;
import org.apache.samza.storage.kv.KeyValueStore;
import org.ekstep.ep.samza.system.Location;
import org.ekstep.ep.samza.util.LatLongUtils;

public class LocationService {
    public static final double ONE_DECIMAL_DEGREE_IN_METER_AT_EQUATOR_IN_KMS = 111320.0;
    private KeyValueStore<String, Object> reverseSearchStore;
    private GoogleReverseSearchService googleReverseSearch;
    private double reverseSearchCacheAreaSizeInMeters;

    public LocationService(KeyValueStore<String, Object> reverseSearchStore,
                           GoogleReverseSearchService googleReverseSearch,
                           double reverseSearchCacheAreaSizeInMeters) {
        this.reverseSearchStore = reverseSearchStore;
        this.googleReverseSearch = googleReverseSearch;
        this.reverseSearchCacheAreaSizeInMeters = reverseSearchCacheAreaSizeInMeters;
    }

    public Location getLocation(String loc) {
        Area area = findCacheAreaLocationBelongsTo(loc);
        String stored_location = (String) reverseSearchStore.get(area.midpointLocationString());
        if (stored_location == null) {
            return getLocationFromGoogle(area.midpointLocationString());
        } else {
            System.out.println("Picking store data for reverse search");
            return (Location) JsonReader.jsonToJava(stored_location);
        }
    }

    private Location getLocationFromGoogle(String loc) {
        System.out.println("Performing reverse search");
        Location location = googleReverseSearch.getLocation(loc);
        String json = JsonWriter.objectToJson(location);

        System.out.println("Setting device loc in stores");
        reverseSearchStore.put(loc, json);
        return location;
    }

    private Area findCacheAreaLocationBelongsTo(String loc) {
        LatLng latLng = LatLongUtils.parseLocation(loc);
        double areaSize = convertAreaSizeFromMetersToDecimalDegrees();

        int areaX = (int) (latLng.lng / areaSize);
        int areaY = (int) (latLng.lat / areaSize);
        double midX = sixDigits((areaX * areaSize) + areaSize / 2);
        double midY = sixDigits((areaY * areaSize) + areaSize / 2);

        return new Area(latLng.lat, latLng.lng, areaX, areaY, midX, midY);
    }

    private double sixDigits(double x) {
        final NumberFormat numFormat = NumberFormat.getNumberInstance();
        numFormat.setMaximumFractionDigits(6);
        final String resultS = numFormat.format(x);
        String parsable = resultS.replace(".", "");
        parsable = resultS.replace(",", ".");
        double ris = Double.parseDouble(parsable);
        return ris;
    }


    private double convertAreaSizeFromMetersToDecimalDegrees() {
        return reverseSearchCacheAreaSizeInMeters / (ONE_DECIMAL_DEGREE_IN_METER_AT_EQUATOR_IN_KMS * Math.cos(0 * (Math.PI / 180)));
    }

    class Area {
        private final double latitude;
        private final double longitude;
        private double x;
        private double y;
        private double midLongitude;
        private double midLatitude;

        Area(double latitude, double longitude, double x, double y, double midLongitude, double midLatitude) {
            this.latitude = latitude;
            this.longitude = longitude;
            this.x = x;
            this.y = y;
            this.midLongitude = midLongitude;
            this.midLatitude = midLatitude;
        }

        @Override
        public String toString() {
            return "{" +
                    "latitude=" + latitude +
                    ", longitude=" + longitude +
                    ", y=" + y +
                    ", x=" + x +
                    ", midLatitude=" + midLatitude +
                    ", midLongitude=" + midLongitude +
                    '}';
        }

        private String midpointLocationString() {
            return midLatitude + "," + midLongitude;
        }
    }

}