package com.alvaromenezes;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.alvaromenezes.controller.ProcessJSON;
import com.alvaromenezes.pojo.Entity;
import com.alvaromenezes.pojo.ModelLayer;

import junit.framework.TestCase;

@RunWith(JUnit4.class)
public class ProcessJSONTest extends TestCase {

	@Test
	public void isArray() {
		ProcessJSON process = new ProcessJSON();
		Object o = new JSONArray();
		assertEquals(true, process.isArray(o));
	}

	@Test
	public void isNotArray() {
		ProcessJSON process = new ProcessJSON();
		Object o = new JSONObject();
		assertEquals(false, process.isArray(o));

	}
	@Ignore
	@Test
	public void getModelLayer() {
		ProcessJSON process = new ProcessJSON();
		
		ModelLayer model = process.getModelLayer("{\"Pessoa\":{\"name\":\"John Smith\",\"age\":44}}");
		assertEquals(true, model instanceof ModelLayer);

	}

}
