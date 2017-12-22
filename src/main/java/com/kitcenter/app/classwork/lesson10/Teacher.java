package com.kitcenter.app.classwork.lesson10;

public class Teacher extends Person {

    //Constructors
    public Teacher() {
    }

    ;

    public Teacher(String name, int age, String university, String response) {
        super(name, age, university, response);
    }

    //Method prints out average teacher's age
    @Override
    public void averageAge() {
        System.out.println("Average teacher\'s age is 37");
    }

}
