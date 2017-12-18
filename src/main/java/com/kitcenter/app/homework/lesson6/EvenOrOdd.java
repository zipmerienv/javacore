package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

public class EvenOrOdd {
    public static void evenOrOdd() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Еnter your number: ");
        double num = userInput.nextDouble();
        if (check(num)) {
            System.out.println(num + " is even.");

        } else {
            System.out.println(num + "is odd.");

        }

    }

    public static boolean check(double num) {
        return (num % 2) == 0;
    }
}