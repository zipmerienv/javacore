package com.kitcenter.app.classwork.lesson10;

public class Lecturer extends Person {
    private String faculty, experience, degree;

//Constructors

    public Lecturer(String faculty, String experience, String degree, String university, int age) {
        super.age = age;
        super.university = university;
        this.faculty = faculty;
        this.experience = experience;
        this.degree = degree;
    }

    //Getters and setters
    @Override
    public void getAll() {
        System.out.println("Lecturer\'s info: " +
                "faculty - " + faculty + ", experience - " +
                experience + ", degree - " + degree + ", university - " +
                university + ", age - " + age);
    }

    public String setAllLecturerInfo(String faculty, String experience, String degree, String university, int age) {
        return faculty + experience + degree + university + age;
    }

    public String getLecturerFaculty(String faculty) {
        return faculty;
    }

    public String setLecturerFaculty(String faculty) {
        return faculty;
    }

    public String getLecturerExperience(String experience) {
        return experience;
    }

    public String setLecturerExperience(String experience) {
        return experience;
    }

    public String getLecturerDegree(String degree) {
        return degree;
    }

    public String setLecturerDegree(String degree) {
        return degree;
    }

    // Method prints out lecturer's degree
    @Override
    public void showDegree() {
        System.out.println("Lecturer's degree");
    }
}
