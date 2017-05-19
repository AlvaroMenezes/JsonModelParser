package com.alvaromenezes;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.alvaromenezes.controller.ProcessJSON;

import junit.framework.TestCase;

import org.junit.runners.JUnit4;
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

}
