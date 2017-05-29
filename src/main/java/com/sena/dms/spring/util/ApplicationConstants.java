package com.sena.dms.spring.util;

import java.sql.Date;
import java.sql.Timestamp;

public interface ApplicationConstants {

	Timestamp DEFAULT_DB_TIMESTAMP = Timestamp.valueOf("0001-01-01 00:00:00.0");
	Date DEFAULT_DB_DATE = Date.valueOf("0001-01-01");
	String DEFAULT_SEQ_NUMBER = "999";
	String SYSTEM_ERROR_MSG = "Application Runtime Error Occurred, Please retry by providing correct data.";
	String DATA_NOT_AVAILABLE_MSG = "Data not available for the selection criteria,Please retry by providing correct data.";

}
