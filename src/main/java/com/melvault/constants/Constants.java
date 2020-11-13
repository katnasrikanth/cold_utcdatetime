package com.melvault.constants;

public class Constants {

	public static final String FIND_BY_ID = "select u from MeasurementEntity u where u.id=:id";
		
	public static final String  FIND_ALL_BY_TIME_BETWEEN_HOURS_AND_MINUTES= "select a from MeasurementEntity a where a.timestamp1>:datetime";

}
