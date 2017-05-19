package com.alvaromenezes.pojo;

import java.util.List;

public class Entity {

	public final String modelName;

	public final String dbAlias;

	public final String jsonAlias;

	public final String packageName;

	public final List<Atribute> atributes;

	public Entity(String modelName, String dbAlias, String jsonAlias, String packageName, List<Atribute> atributes) {
		this.modelName = modelName;
		this.dbAlias = dbAlias;
		this.jsonAlias = jsonAlias;
		this.packageName = packageName;
		this.atributes = atributes;
	}

}
