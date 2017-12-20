package com.kitcenter.runners.classwork.lesson10;

import com.kitcenter.app.classwork.lesson10.Student;

public class InheritRunner {
    public static void main(String[] args) {
        Student john = new Student("John", 12, "Colorado", "Yes");
        john.getAge();
        john.getName();
        john.getUniversity();
        john.getResponse();

        System.out.println(john.getName() + " is " + john.getAge() + " year old student who studies in " + john.getUniversity() + " university. His responce is: " + john.getResponse());
    }
}
