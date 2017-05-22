package com.alvaromenezes.pojo;

import java.util.ArrayList;
import java.util.List;

public class Entity {

	public final String name;
	public final List<Attribute> attributes;

	public Entity(String name, List<Attribute> attributes) {
		this.name = name;
		this.attributes = attributes;
	}
	
	public Entity(String name) {
		this.name = name;
		this.attributes = new ArrayList<Attribute>();
	}

}