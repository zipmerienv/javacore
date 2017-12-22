package com.kitcenter.app.classwork.lesson10;

public class Person {

    protected String name;
    protected int age;
    protected String secondname;
    protected String university;
    protected String response = "Ehhh, what was the question?";

    // Constructors
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String secondname) {
        this();
        this.secondname = secondname;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(int age, String university) {
        this();
        this.university = university;
    }

    public Person(String name, int age) {
        this();
    }


    public Person(String name, int age, String university, String response) {
        this();
        this.response = response;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

     /* public String getAll(String name, int age){
        return String.format(name, age);
    }*/

    public void getAll() {
        System.out.println("name - " + name + "age - " + age + "university - " + university + "university - " + response);
    }

    // Method prints out default average age
    public void averageAge() {
        System.out.println("Average person\'s age is 39");
    }

    //Method prints general degree
    public void showDegree() {
        System.out.println("General degree");
    }

}
