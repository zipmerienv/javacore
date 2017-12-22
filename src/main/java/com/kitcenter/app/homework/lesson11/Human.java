package com.kitcenter.app.homework.lesson11;

public class Human {

    private int age = 13;
    private String name = "default";

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getHumanName() {
        return name;
    }

    public int getHumanAge() {
        return age;
    }

    public int setHumanAge(int age) {
        if (1 <= age && age <= 120) {
            System.out.println("New age is set");


        } else System.out.println("Age is invalid");
        return this.age = age;
    }


}
