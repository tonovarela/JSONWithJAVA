package com.tonovarela.proyecto.files;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import com.tonovarela.proyecto.nested.models.Person;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class JsonWriteReaderList
{

    static void main() {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Person> people = new ArrayList<>();
        try (FileReader reader = new FileReader("person.json")) {
            System.out.println("Reading JSON from file...");
            Type listType = new TypeToken<List<Person>>() {}.getType();
            people = gson.fromJson(reader, listType);
        }

        catch (JsonIOException e) {
            System.out.println("Error reading JSON from file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File not found or error reading file: " + e.getMessage());
        }
        for (Person person : people) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + ", Student: " + person.isStudent());
        }



        people.add(new Person("Melissa", 30, false));
        people.add(new Person("Marco", 50, false));
        people.add(new Person("Andrea", 40, false));
        try (FileWriter writer = new FileWriter("person.json")) {
            gson.toJson(people,writer);
            System.out.println("JSON file created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating/writing to file: " + e.getMessage());
        }
        catch(JsonIOException j){
            System.out.println("Error writing JSON to file.");
        }



    }
}
