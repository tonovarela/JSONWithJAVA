package com.tonovarela.proyecto.nested;


import com.tonovarela.proyecto.nested.models.PersonProyect;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main() {

        List<PersonProyect> persons= JsonReader.loadPersons("person-example.json");
        System.out.println("*** Persons List:");
        for (PersonProyect person: persons) {
            System.out.println(person);
        }
        PersonProyect newPerson= new PersonProyect();
        newPerson.setName("Miroslava");
        newPerson.setAge(28);
        newPerson.setActive(true);
        newPerson.setEmail("dlove@love.com");
        ArrayList<String> hobbies= new ArrayList<>();
        hobbies.add("Painting");
        hobbies.add("Traveling");
        newPerson.setHobbies(hobbies);
        persons.add(newPerson);

        JsonReader.savePersons(persons,"person-example.json");



//        AppConfig appConfig = JsonReader.load("config.json");
//        if (appConfig != null) {
//
//            System.out.println("*** App:"+ appConfig.appName);
//            System.out.println("*** Version:" + appConfig.version);
//            System.out.println("*** Theme:" +appConfig.settings.theme);
//            System.out.println("*** Notifications:" + appConfig.settings.notifications);
//            System.out.println("*** Language:" + appConfig.settings.language);
//            System.out.println("*** --------------------------------------");
//            appConfig.settings.theme = "Light";
//            appConfig.appName="Varela";
//            JsonReader.save(appConfig, "config.json");

        //}
    }
}
