package com.tonovarela.proyecto.nested;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.tonovarela.proyecto.nested.models.AppConfig;
import com.tonovarela.proyecto.nested.models.Person;
import com.tonovarela.proyecto.nested.models.PersonProyect;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonReader {


    public static AppConfig load(String filePath){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileReader reader = new FileReader(filePath)) {
            return  gson.fromJson(reader, AppConfig.class);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void save(AppConfig appConfig, String filePath){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(appConfig, writer);
            System.out.println("Configuration saved successfully to " + filePath);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }



    public static List<PersonProyect> loadPersons(String filePath){
         List<PersonProyect> persons = new ArrayList<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileReader reader = new FileReader(filePath)) {
            Type listType = new TypeToken<List<PersonProyect>>() {}.getType();
            persons = gson.fromJson(reader, listType);
            return  persons;
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return persons;
    }

//    public static void savePersons(List<PersonProyect> persons, String filePath){
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        try (FileWriter writer = new FileWriter(filePath)) {
//            gson.toJson(persons, writer);
//            System.out.println("Persons saved successfully to " + filePath);
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//    }





}
