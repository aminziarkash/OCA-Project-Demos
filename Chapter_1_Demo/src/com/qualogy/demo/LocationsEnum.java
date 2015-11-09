package com.qualogy.demo;

public enum LocationsEnum 
{
	RIJSWIJK ("Rijswijk"),
	DENHAAG ("Den Haag"),
	AMSTERDAM ("Amsterdam");
	
	private final String desc;
	
	private LocationsEnum(String description)
	{
		desc = description;
	}
	
	//
	// get the description from the enum above inside quotes
	public String getDesc()
	{
		return desc;
	}
}