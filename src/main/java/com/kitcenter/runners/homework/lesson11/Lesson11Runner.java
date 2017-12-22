package com.kitcenter.runners.homework.lesson11;

import com.kitcenter.app.homework.lesson11.Human;

public class Lesson11Runner {
    public static void main(String[] args) {

        Human steevy = new Human(12, "Steevy");

        steevy.getHumanName();
        steevy.getHumanAge();
        System.out.println(steevy.getHumanName() + " was " + steevy.getHumanAge() + " years old when I last saw him");
        steevy.setHumanAge(90);
        System.out.println(steevy.getHumanName() + " is now " + steevy.getHumanAge() + " years old");

    }
}
