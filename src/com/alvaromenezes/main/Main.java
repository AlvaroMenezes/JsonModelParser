package com.alvaromenezes.main;

import java.io.IOException;

import com.alvaromenezes.controller.JsonExamples;
import com.alvaromenezes.controller.ProcessJSON;
import com.alvaromenezes.pojo.Attribute;
import com.alvaromenezes.pojo.Entity;
import com.alvaromenezes.pojo.ModelLayer;

public class Main {

	public static void main(String[] args) throws IOException {

		ModelLayer model = new ProcessJSON().getModelLayer(JsonExamples.json1);

		for (Entity e : model.entities) {

			System.out.println("Entity: " + e.name);

			for (Attribute a : e.attributes) {

				if (!a.isArray) {

					System.out.println("       Atributo: " + a.dataType + "    " + a.name);
				} else {
					System.out.println("       Atributo: array of " + a.dataType + "    " + a.name);
				}

			}

		}

	}

}
