package com.alvaromenezes.controller;

import org.json.JSONArray;

import com.alvaromenezes.pojo.ModelLayer;

public class ProcessJSON {

	public boolean isArray(Object o) {
		if (o instanceof JSONArray) {
			return true;
		}
		return false;
	}
	public ModelLayer getModelLayer(String json) {
		
		return null;
	}
	

	/*
	 * private JSONO url;
	 * 
	 * public processJSON(String url) { this.url = url; }
	 * 
	 * public ModelLayer getModelLayer() { //ODataMetadataRequest req =
	 * ODataRetrieveRequestFactory.getMetadataRequest(url);
	 * 
	 * //EdmMetadata metadata = req.execute().getBody();
	 * 
	 * //88**********************
	 * 
	 * File file = new File(Generate.DEFAULT_PATH+"/fortlev.xml");
	 * 
	 * FileInputStream fis = null;
	 * 
	 * try { fis = new FileInputStream(file); }catch( Exception e){
	 * e.printStackTrace();
	 * 
	 * } EdmMetadata metadata = ODataReader.readMetadata(fis);
	 * 
	 * //***********
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Schema firstSchema = metadata.getSchemas().get(0);
	 * 
	 * List<Entity> entities = new ArrayList<Entity>();
	 * 
	 * for (EntityType entityType : firstSchema.getEntityTypes()) {
	 * System.out.println("NOME: " + entityType.getName());
	 * 
	 * List<Atribute> atributes = new ArrayList<Atribute>(); for (Property prop
	 * : entityType.getProperties()) { System.out.println("prop name: " +
	 * prop.getName() + " type: " + prop.getType());
	 * 
	 * try{ DataType dataType = ParseDataType(prop.getType());
	 * 
	 * Atribute atrr = new Atribute(prop.getName(), "", "", dataType, false,
	 * false, false); atributes.add(atrr); }catch (Exception e) {
	 * System.out.println("ERRO"); System.out.println(e.getMessage()); } }
	 * 
	 * Entity entity = new Entity(entityType.getName(), "", "",
	 * "com.itsmobile.fortlev", atributes); entities.add(entity); }
	 * 
	 * 
	 * ModelLayer model = new ModelLayer(entities); return model;
	 * 
	 * }
	 * 
	 * private DataType ParseDataType(String value) {
	 * 
	 * value = value.replace("Edm.", ""); OdataDataType odt =
	 * OdataDataType.valueOf(value);
	 * 
	 * DataType datatype = null;
	 * 
	 * switch (odt) { case Binary: datatype = DataType.BLOB; break; case
	 * Boolean: datatype = DataType.BOOLEAN; break; case Byte: datatype =
	 * DataType.INTEGER; break; case Decimal: datatype = DataType.REAL; break;
	 * case Double: datatype = DataType.REAL; break; case Guid: datatype =
	 * DataType.TEXT; break; case Int16: datatype = DataType.INTEGER; break;
	 * case Int32: datatype = DataType.INTEGER; break; case Int64: datatype =
	 * DataType.INTEGER; break; case SByte: datatype = DataType.INTEGER; break;
	 * case Single: datatype = DataType.REAL; break; case String: datatype =
	 * DataType.TEXT; break; case Time: datatype = DataType.TEXT; break; case
	 * DateTimeOffset: datatype = DataType.TEXT; break; default: datatype =
	 * DataType.TEXT; break;
	 * 
	 * }
	 * 
	 * return datatype; }
	 * 
	 */
}
