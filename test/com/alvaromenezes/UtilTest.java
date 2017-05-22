package com.alvaromenezes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.alvaromenezes.controller.Util;

import junit.framework.TestCase;

@RunWith(JUnit4.class)
public class UtilTest extends TestCase {

	@Test
	public void fistUpperCaseTest() {

		Util util = new Util();

		String value = util.fistUpperCase("java");

		assertEquals("Java", value);
	}

}
