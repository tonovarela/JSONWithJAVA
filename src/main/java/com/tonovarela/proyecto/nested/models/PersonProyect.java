package com.tonovarela.proyecto.nested.models;

import java.util.ArrayList;

public class PersonProyect {

    public String name;
    public Integer age;
    public boolean active;
    public String email;

    ArrayList<String> hobbies;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "PersonProyect{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", active=" + active +
                ", hobbies=" + hobbies +
                '}';
    }

}
