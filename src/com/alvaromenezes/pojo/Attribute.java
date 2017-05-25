package com.alvaromenezes.pojo;

public class Attribute {

	public final String name;
	public final String dataType;
	public final boolean isArray;

	public Attribute(String name, String dataType) {
		this.name = name;
		this.dataType = dataType;
		this.isArray = false;
	}

	public Attribute(String name, String dataType, boolean isArray) {
		this.name = name;
		this.dataType = dataType;
		this.isArray = isArray;
	}

}
