package com.kitcenter.app.classwork.lesson10;

public class Student extends Person { //class name

    private String university;
    private String response = "Ehhh, what was the question?";

    public Student(String name, int age, String university, String response) {
        super(name, age);

        this.university = university;
        this.response = response;
    }

    public String getUniversity() {
        return university;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}

