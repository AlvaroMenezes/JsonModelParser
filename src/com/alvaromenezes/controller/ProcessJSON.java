package com.alvaromenezes.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.alvaromenezes.pojo.Attribute;
import com.alvaromenezes.pojo.Entity;
import com.alvaromenezes.pojo.ModelLayer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ProcessJSON {


	public void addAttributes(HashMap<String, Entity> entities, JsonNode node) {

		String entityName = node.fields().next().getKey();
		entityName = Util.fistUpperCase(entityName);

		//if (!entities.containsKey(entityName)) {

			JsonNode child = node.path(node.fields().next().getKey());
			Iterator<Map.Entry<String, JsonNode>> fields = child.fields();
			while (fields.hasNext()) {
				Map.Entry<String, JsonNode> entry = fields.next();

				if (entry.getValue().isObject()) {

					String name = Util.fistUpperCase(entry.getKey());
					String type = Util.fistLowerCase(entry.getKey());

					Attribute attribute = new Attribute(name, type);
					entities.get(entityName).attributes.add(attribute);
					
					ObjectNode xxx = JsonNodeFactory.instance.objectNode();
					xxx.put( entry.getKey(),entry.getValue());

					addEntity(entities,xxx);

				} else if (entry.getValue().isArray()) {

				} else {
					String name = Util.fistLowerCase(entry.getKey());
					String type = getDataType(entry.getValue());

					Attribute attribute = new Attribute(name, type);
					
					entities.get(entityName).attributes.add(attribute);
				}

			}

	//	}

	}

	public void addEntity(HashMap<String, Entity> entities, JsonNode node) {

		System.out.println("addEntity");

		String name = node.fields().next().getKey();
		name = Util.fistUpperCase(name);
		
		if (!entities.containsKey(name)) {
			Entity entity = new Entity(name);

			entities.put(name, entity);	
			addAttributes(entities, node);
		}
		
	}

	public boolean isEntity(JsonNode jsonNode) {

		if (jsonNode.size() == 1 && jsonNode.fields().next().getValue().isObject()) {
			return true;
		}
		return false;
	}

	public ModelLayer getModelLayer(String json) {

		ObjectMapper objectMapper = new ObjectMapper();
		HashMap<String, Entity> entities = new HashMap<>();

		try {
			JsonNode rootNode = objectMapper.readTree(json);

			if (isEntity(rootNode)) {

				addEntity(entities, rootNode);

			}else{
				Entity entity = new Entity("Model");
				ObjectNode node = JsonNodeFactory.instance.objectNode();
				node.put("Model", rootNode);
				
				addEntity(entities, node);
			}
			
		

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		ModelLayer model = new ModelLayer( new ArrayList<Entity> (entities.values()));
		

		return model;
	}

	public String getDataType(JsonNode node) {

		if (node.isBoolean()) {

			return boolean.class.getSimpleName();

		} else if (node.isInt()) {

			return int.class.getSimpleName();
		} else if (node.isDouble()) {

			return double.class.getSimpleName();
		} else if (node.isFloat()) {

			return float.class.getSimpleName();
		} else if (node.isTextual()) {

			return String.class.getSimpleName();
		} else if (node.isBigDecimal()) {

			return BigDecimal.class.getSimpleName();
		} else if (node.isBigInteger()) {

			return BigInteger.class.getSimpleName();
		} else if (node.isLong()) {

			return long.class.getSimpleName();
		} else if (node.isShort()) {

			return short.class.getSimpleName();
		} else if (node.isBinary()) {

			return "byte[]";
		}

		return Object.class.getSimpleName();

	}

}
