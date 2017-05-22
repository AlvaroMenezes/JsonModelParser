package com.alvaromenezes.controller;

public class Util {

	public static String fistUpperCase(String value) {

		if (value.length() == 1) {
			return value.toUpperCase();
		}

		value = String.format("%s%s", Character.toUpperCase(value.charAt(0)), value.substring(1));
		return value;
	}

	public static String fistLowerCase(String value) {

		if (value.length() == 1) {
			return value.toUpperCase();
		}

		value = String.format("%s%s", Character.toLowerCase(value.charAt(0)), value.substring(1));
		return value;
	}
}
