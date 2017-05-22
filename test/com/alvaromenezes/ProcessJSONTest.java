package com.alvaromenezes;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.alvaromenezes.controller.ProcessJSON;
import com.alvaromenezes.pojo.Entity;
import com.alvaromenezes.pojo.ModelLayer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import junit.framework.TestCase;

@RunWith(JUnit4.class)
public class ProcessJSONTest extends TestCase {
	
	@Test
	public void testIsJsonArray() {
		ProcessJSON process = new ProcessJSON();
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Entity> entities = new HashMap<>();
	
		
			JsonNode jsonNode = null;
			try {
				jsonNode = objectMapper.readTree("{\"Person\":{\"name\":\"John Smith\",\"age\":44}}");
			} catch (IOException e) {
				fail("exception error");
			}
		
			assertEquals(true, process.isEntity(jsonNode));
	}
	

	/*@Test
	public void testIsJsonArray() {
		ProcessJSON process = new ProcessJSON();
		Object o = new JSONArray();
		assertEquals(true, process.isArray(o));
	}

	@Test
	public void testIsNotJsonArray() {
		ProcessJSON process = new ProcessJSON();
		Object o = new JSONObject();
		assertEquals(false, process.isArray(o));

	}

	@Test
	public void tesAddEntity() {

		ProcessJSON process = new ProcessJSON();
		HashMap<String, Entity> entities = new HashMap<>();
		JSONObject o = null;
		try {
			o = new JSONObject("{\"Person\":{\"name\":\"John Smith\",\"age\":44}}");
		} catch (JSONException e) {
		}

		try {
			process.addEntity(entities, o);
		} catch (JSONException e) {
		}
		assertEquals(1, entities.size());
	}

	@Test
	public void testIsJsonObject() {
		ProcessJSON process = new ProcessJSON();
		Object o = new JSONObject();
		assertEquals(true, process.isJSONObject(o));
	}

	@Test
	public void testNotIsJsonObject() {
		ProcessJSON process = new ProcessJSON();
		Object o = "";
		assertEquals(false, process.isArray(o));

	}

	@Test
	public void testconverStringToJsonOK() {
		ProcessJSON process = new ProcessJSON();
		Object o = null;
		try {
			o = process.strToJsonJSONObject("{\"Person\":{\"name\":\"John Smith\",\"age\":44}}");
		} catch (JSONException e) {
		}
		assertEquals(true, o instanceof JSONObject);

	}

	@Test
	public void testConvertJsonThrowJSONException() {
		ProcessJSON process = new ProcessJSON();
		Object o = null;
		try {
			o = process.strToJsonJSONObject("{\"Person\":\"name\":\"John Smith\",\"age\":44}}");
		} catch (JSONException e) {
			assertEquals(true, e instanceof JSONException);
		}

	}

	@Test
	public void getModelLayer() {
		ProcessJSON process = new ProcessJSON();

		ModelLayer model = null;
		try {
			model = process.getModelLayer("{\"Pessoa\":{\"name\":\"John Smith\",\"age\":44}}");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true, model instanceof ModelLayer);

	}*/

}
