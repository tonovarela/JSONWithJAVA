package com.tonovarela.proyecto.files;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.tonovarela.proyecto.nested.models.Person;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter  {
    static void main() {
        Person person = new Person("Tono", 25,true);
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter("person.json")) {
            gson.toJson(person,writer);
            System.out.println("JSON file created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating/writing to file: " + e.getMessage());
        }
        catch(JsonIOException j){
            System.out.println("Error writing JSON to file.");
        }

        System.out.println("Finished writing JSON to file.");

        try (FileReader reader = new FileReader("person.json")) {
            Person personFromFile = gson.fromJson(reader, Person.class);
            System.out.println("Person read from JSON file: " + personFromFile);
        } catch (JsonIOException e) {
            System.out.println("Error reading JSON from file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File not found or error reading file: " + e.getMessage());
        }

    }
}
