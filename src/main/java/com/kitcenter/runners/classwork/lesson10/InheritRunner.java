package com.kitcenter.runners.classwork.lesson10;

import com.kitcenter.app.classwork.lesson10.Lecturer;
import com.kitcenter.app.classwork.lesson10.Person;
import com.kitcenter.app.classwork.lesson10.Student;
import com.kitcenter.app.classwork.lesson10.Teacher;

public class InheritRunner {
    public static void main(String[] args) {
        Student john = new Student("John", 12, "Cambridges", "Yes");
        john.getAge();
        john.getName();
        john.getUniversity();
        john.getResponse();
        john.getAll();
        System.out.println(john.getName() + " is " + john.getAge() +
                " year old student who studies in " + john.getUniversity() +
                " university. His responce is: " + john.getResponse());


        Person person = new Person();
        person.averageAge();
        Person student = new Student();
        student.averageAge();
        Person teacher = new Teacher();
        teacher.averageAge();


        Person lecturer = new Lecturer("Law", "10 years", "master", "Colorado", 13);
        lecturer.getAll();

        System.out.println("");

        lecturer.showDegree();

        System.out.println("");

        Person mike = new Student();
        mike.showDegree();


    }
}
