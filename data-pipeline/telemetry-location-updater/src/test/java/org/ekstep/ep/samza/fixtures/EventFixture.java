package org.ekstep.ep.samza.fixtures;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.Map;

public class EventFixture {

	public static final String LOG_EVENT = "{\n" +
            "  \"did\": \"00b09a9e-6af9-4bb7-b102-57380b43ddc8\",\n" +
            "  \"mid\": \"43288930-e54a-230b-b56e-876gnm8712ok\",\n" +
            "  \"edata\": {\n" +
            "    \"eks\": {\n" +
            "      \"data\": \"\",\n" +
            "      \"err\": \"10\",\n" +
            "      \"eventId\": \"GE_SIGNUP\",\n" +
            "      \"id\": \"2131165210\",\n" +
            "      \"type\": \"GENIE\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"eid\": \"LOG\",\n" +
            "  \"gdata\": {\n" +
            "    \"id\": \"genie.android\",\n" +
            "    \"ver\": \"2.2.15\"\n" +
            "  },\n" +
            "  \"pdata\": {\n" +
            "    \"id\": \"genie\",\n" +
            "    \"ver\": \"2.0\"\n" +
            "  },\n" +
            "  \"sid\": \"\",\n" +
            "  \"ets\": 1454064092546,\n" +
            "  \"uid\": \"\",\n" +
            "  \"ver\": \"2.2\",\n" +
            "  \"channel\": \"in.ekstep\",\n" +
            "  \"cdata\": [\n" +
            "    {\n" +
            "      \"id\": \"correlationid\",\n" +
            "      \"type\": \"correlationtype\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";
	public static final String ERROR_EVENT = "{\n" +
            "  \"did\": \"00b09a9e-6af9-4bb7-b102-57380b43ddc8\",\n" +
            "  \"mid\": \"43288930-e54a-230b-b56e-876gnm8712ok\",\n" +
            "  \"eid\": \"ERROR\",\n" +
            "  \"gdata\": {\n" +
            "    \"id\": \"genie.android\",\n" +
            "    \"ver\": \"2.2.15\"\n" +
            "  },\n" +
            "  \"pdata\": {\n" +
            "    \"id\": \"genie\",\n" +
            "    \"ver\": \"2.0\"\n" +
            "  },\n" +
            "  \"sid\": \"\",\n" +
            "  \"ets\": 1454064092546,\n" +
            "  \"uid\": \"\",\n" +
            "  \"ver\": \"2.2\",\n" +
            "  \"channel\": \"in.ekstep\",\n" +
            "  \"cdata\": [\n" +
            "    {\n" +
            "      \"id\": \"correlationid\",\n" +
            "      \"type\": \"correlationtype\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";
	public static final String UNPARSABLE_START_EVENT = "{\n" +
            "  \"did\": \"c270f15d-5230-4954-92aa-d239e4281cc4\",\n" +
            "  \"mid\": \"43288930-e54a-230b-b56e-876gnm8712ok\",\n" +
            "  \"edata\": {\n" +
            "    \"eks\": {\n" +
            "      \"mode\": \"WIFI\",\n" +
            "      \"ver\": \"12\",\n" +
            "      \"size\": 12.67,\n" +
            "      \"err\": \"\",\n" +
            "      \"referrer\": [\n" +
            "        {\n" +
            "          \"action\": \"INSTALL\",\n" +
            "          \"utmsource\": \"Ekstep\",\n" +
            "          \"utmmedium\": \"Portal\",\n" +
            "          \"utmterm\": \"December 2016\",\n" +
            "          \"utmcontent\": \"Ramayana\",\n" +
            "          \"utmcampaign\": \"Epics of India\"\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  },\n" +
            "  \"eid\": \"START\",\n" +
            "  \"gdata\": {\n" +
            "    \"id\": \"genie.android\",\n" +
            "    \"ver\": \"1.0\"\n" +
            "  },\n" +
            "  \"sid\": \"\",\n" +
            "  \"ets\": 1454064092546,\n" +
            "  \"uid\": \"\",\n" +
            "  \"ver\": \"2.0\",\n" +
            "  \"cdata\": [\n" +
            "    {\n" +
            "      \"id\": \"correlationid\",\n" +
            "      \"type\": \"correlationtype\"\n" +
            "    ";
	public static final String START_EVENT = "{\n" +
            "  \"cdata\": [],\n" +
            "  \"channel\": \"in.ekstep\",\n" +
            "  \"did\": \"0427fedf56eea1c8a127d876fd1907ffb245684f\",\n" +
            "  \"edata\": {\n" +
            "    \"eks\": {\n" +
            "      \"extype\": \"\",\n" +
            "      \"id\": \"\",\n" +
            "      \"pos\": [],\n" +
            "      \"stageid\": \"Genie-TelemetrySync\",\n" +
            "      \"subtype\": \"ManualSync-Success\",\n" +
            "      \"tid\": \"\",\n" +
            "      \"type\": \"OTHER\",\n" +
            "      \"uri\": \"\",\n" +
            "      \"values\": [\n" +
            "        {\n" +
            "          \"SizeOfFileInKB\": \"0.81\"\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  },\n" +
            "  \"eid\": \"GE_INTERACT\",\n" +
            "  \"etags\": {\n" +
            "    \"app\": []\n" +
            "  },\n" +
            "  \"ets\": 1506328824238,\n" +
            "  \"gdata\": {\n" +
            "    \"id\": \"org.ekstep.genieservices.qa\",\n" +
            "    \"ver\": \"6.5.localdev-debug\"\n" +
            "  },\n" +
            "  \"mid\": \"375f4921-bf7b-45b0-8cf1-ba92d876a815\",\n" +
            "  \"pdata\": {\n" +
            "    \"id\": \"genie\",\n" +
            "    \"ver\": \"6.5.localdev-debug\"\n" +
            "  },\n" +
            "  \"sid\": \"e9662bb5-cf08-42d6-ad11-700b23566961\",\n" +
            "  \"ts\": \"2017-09-25T08:40:24.238+0000\",\n" +
            "  \"uid\": \"03762014-f67b-466b-bf20-467f46542563\",\n" +
            "  \"ver\": \"2.2\",\n" +
            "  \"@version\": \"1\",\n" +
            "  \"@timestamp\": \"2017-09-25T08:35:44.037Z\",\n" +
            "  \"metadata\": {\n" +
            "    \"checksum\": \"375f4921-bf7b-45b0-8cf1-ba92d876a815\"\n" +
            "  },\n" +
            "  \"uuid\": \"7f2c9f88-cbf7-4527-9f8d-667d4dde0d1c1\",\n" +
            "  \"key\": \"03762014-f67b-466b-bf20-467f46542563\",\n" +
            "  \"type\": \"events\",\n" +
            "  \"flags\": {\n" +
            "    \"dd_processed\": true\n" +
            "  }\n" +
            "}";

	public static final String INTERACT_EVENT = "{\n" +
			"    \"actor\": {\n" +
			"        \"type\": \"User\",\n" +
			"        \"id\": \"393407b1-66b1-4c86-9080-b2bce9842886\"\n" +
			"    },\n" +
			"    \"eid\": \"INTERACT\",\n" +
			"    \"edata\": {\n" +
			"		 \"loc\":\"xyz\",\n" +
			"        \"id\": \"ContentDetail\",\n" +
			"        \"pageid\": \"ContentDetail\",\n" +
			"        \"type\": \"TOUCH\",\n" +
			"        \"subtype\": \"ContentDownload-Initiate\"\n" +
			"    },\n" +
			"    \"ver\": \"3.0\",\n" +
			"    \"ets\": 1541574545180,\n" +
			"    \"context\": {\n" +
			"        \"pdata\": {\n" +
			"            \"ver\": \"2.1.8\",\n" +
			"            \"pid\": \"sunbird.app\",\n" +
			"            \"id\": \"prod.diksha.app\"\n" +
			"        },\n" +
			"        \"channel\": \"0123221617357783046602\",\n" +
			"        \"env\": \"sdk\",\n" +
			"        \"did\": \"68dfc64a7751ad47617ac1a4e0531fb761ebea6f\",\n" +
			"        \"cdata\": [\n" +
			"            {\n" +
			"                \"type\": \"qr\",\n" +
			"                \"id\": \"K4KCXE\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"type\": \"API\",\n" +
			"                \"id\": \"f3ac6610-d218-11e8-b2bb-1598ac1fcb99\"\n" +
			"            }\n" +
			"        ],\n" +
			"        \"sid\": \"70ea93d0-e521-4030-934f-276e7194c225\"\n" +
			"    },\n" +
			"    \"mid\": \"e6a3bcd3-eb78-457b-8fc0-4acc94642ebf\",\n" +
			"    \"object\": {\n" +
			"        \"id\": \"do_31249561779090227216256\",\n" +
			"        \"type\": \"Content\",\n" +
			"        \"version\": \"\"\n" +
			"    },\n" +
			"    \"tags\": [\n" +
			"        \n" +
			"    ],\n" +
			"    \"syncts\": 1539846605341,\n" +
			"    \"@timestamp\": \"2018-10-18T07:10:05.341Z\"\n" +
			"}";

	public static final String INTERACT_EVENT_WITHOUT_DID = "{\n" +
			"    \"actor\": {\n" +
			"        \"type\": \"User\",\n" +
			"        \"id\": \"393407b1-66b1-4c86-9080-b2bce9842886\"\n" +
			"    },\n" +
			"    \"eid\": \"INTERACT\",\n" +
			"    \"edata\": {\n" +
			"		 \"loc\":\"xyz\",\n" +
			"        \"id\": \"ContentDetail\",\n" +
			"        \"pageid\": \"ContentDetail\",\n" +
			"        \"type\": \"TOUCH\",\n" +
			"        \"subtype\": \"ContentDownload-Initiate\"\n" +
			"    },\n" +
			"    \"ver\": \"3.0\",\n" +
			"    \"ets\": 1541574545180,\n" +
			"    \"context\": {\n" +
			"        \"pdata\": {\n" +
			"            \"ver\": \"2.1.8\",\n" +
			"            \"pid\": \"sunbird.app\",\n" +
			"            \"id\": \"prod.diksha.app\"\n" +
			"        },\n" +
			"        \"channel\": \"0123221617357783046602\",\n" +
			"        \"env\": \"sdk\",\n" +
			"        \"cdata\": [\n" +
			"            {\n" +
			"                \"type\": \"qr\",\n" +
			"                \"id\": \"K4KCXE\"\n" +
			"            },\n" +
			"            {\n" +
			"                \"type\": \"API\",\n" +
			"                \"id\": \"f3ac6610-d218-11e8-b2bb-1598ac1fcb99\"\n" +
			"            }\n" +
			"        ],\n" +
			"        \"sid\": \"70ea93d0-e521-4030-934f-276e7194c225\"\n" +
			"    },\n" +
			"    \"mid\": \"e6a3bcd3-eb78-457b-8fc0-4acc94642ebf\",\n" +
			"    \"object\": {\n" +
			"        \"id\": \"do_31249561779090227216256\",\n" +
			"        \"type\": \"Content\",\n" +
			"        \"version\": \"\"\n" +
			"    },\n" +
			"    \"tags\": [\n" +
			"        \n" +
			"    ],\n" +
			"    \"syncts\": 1539846605341,\n" +
			"    \"@timestamp\": \"2018-10-18T07:10:05.341Z\"\n" +
			"}";
	public static final String ANY_STRING = "Hey Samza, Whats Up?";
	public static final String EMPTY_JSON = "{}";
	
	public static Map<String, Object> getMap(String message) {
		return (Map<String, Object>) new Gson().fromJson(message, Map.class);
	}
	
}