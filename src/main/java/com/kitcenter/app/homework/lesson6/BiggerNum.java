package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

public class BiggerNum {

    public static void bigger() {

        System.out.println("Enter two nums:");
        Scanner userInput = new Scanner(System.in);
        double num1 = userInput.nextDouble();
        double num2 = userInput.nextDouble();

        if (num1 > num2) {
            System.out.println(num1 + " is bigger than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is bigger than " + num1);
        } else {
            System.out.println("You have entered equal nums!");
        }
    }
}
