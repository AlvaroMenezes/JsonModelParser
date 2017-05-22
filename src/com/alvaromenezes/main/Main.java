package com.alvaromenezes.main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.alvaromenezes.controller.JsonExamples;
import com.alvaromenezes.controller.ProcessJSON;
import com.alvaromenezes.pojo.Attribute;
import com.alvaromenezes.pojo.Entity;
import com.alvaromenezes.pojo.ModelLayer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws IOException {
	

		ModelLayer model = new ProcessJSON().getModelLayer(JsonExamples.json5);
		
		for (Entity e : model.entities) {

			System.out.println("ENTIDADE: " + e.name);

			for (Attribute a : e.attributes) {

				System.out.println("       Atributo: " + a.dataType + "    " + a.name);

			}

		}

	}

}
