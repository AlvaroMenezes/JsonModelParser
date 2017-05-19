package com.alvaromenezes.pojo;

public class Atribute {

	public final DataType type;
	public final String atributeName;
	public final String db_alias;
	public final String json_alias;
	public final Boolean pk;
	public final Boolean autoIncremente;
	public final Boolean notNull;

	public Atribute(String atributeName, String db_alias, String json_alias, DataType type, Boolean notNull, Boolean pk, Boolean autoIncremente) {

		this.atributeName = atributeName;
		this.db_alias = db_alias;
		this.json_alias = json_alias;
		this.type = type;
		this.pk = pk;
		this.autoIncremente = autoIncremente;
		this.notNull = notNull;
	}

}
