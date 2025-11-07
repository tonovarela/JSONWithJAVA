package com.tonovarela.proyecto.nested;

import com.tonovarela.proyecto.nested.models.AppConfig;

public class Main {

    static void main() {
        AppConfig appConfig = JsonReader.load("config.json");
        if (appConfig != null) {

            System.out.println("*** App:"+ appConfig.appName);
            System.out.println("*** Version:" + appConfig.version);
            System.out.println("*** Theme:" +appConfig.settings.theme);
            System.out.println("*** Notifications:" + appConfig.settings.notifications);
            System.out.println("*** Language:" + appConfig.settings.language);
            System.out.println("*** --------------------------------------");
            appConfig.settings.theme = "Light";
            appConfig.appName="Varela";
            JsonReader.save(appConfig, "config.json");

        }
    }
}
