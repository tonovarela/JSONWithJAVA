package com.tonovarela.proyecto.nested.models;

public class Person {
    private String name;
    private Integer age;
    private boolean student;

    public Person(String name, Integer age, boolean student) {
        this.name = name;
        this.age = age;
        this.student = student;
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public boolean isStudent() {
        return student;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", student=" + student +
                '}';
    }
}
