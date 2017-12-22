package com.kitcenter.app.classwork.lesson10;

public class Student extends Person { //class name


    // Constructors
    public Student() {
    }

    ;

    public Student(String name, int age, String university, String response) {
        super.name = name;
        super.age = age;
        super.university = university;
        super.response = response;

    }

    //Getters
    public String getUniversity() {
        return university;
    }

    public String getResponse() {
        return response;
    }

    //Setters
    public void setResponse(String response) {
        this.response = response;
    }


    //Method prints out average student's age
    @Override
    public void averageAge() {
        System.out.println("Average student\'s age is 12");
    }

    // Method prints out student's degree
    @Override
    public void showDegree() {
        System.out.println("Student's degree");
    }

    /*public final String getAll(){
        return String.format("%s%s", name, age);
    } - тут будет ошибка, потому что нельзя унаследовать final метод*/
}

