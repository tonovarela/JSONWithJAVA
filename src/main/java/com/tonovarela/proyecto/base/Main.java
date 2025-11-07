package com.tonovarela.proyecto.base;

import com.google.gson.Gson;
import com.tonovarela.proyecto.nested.models.Person;

public class Main {
    static void main() {
      Person person = new Person("Tono", 25,true);
      Gson gson = new Gson();
      String json = gson.toJson(person);
        System.out.println(json);
        json = """
               {
               "name":"Tono",
               "age":25,
               "student":true
               }
                """;

        Person person2 =gson.fromJson(json,Person.class);
        System.out.println(person2);



    }
}
