package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

public class Triangle {

    public static void triangle() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please, enter values of triangle sides!");
        System.out.print("A:");
        double sideA = userInput.nextDouble();
        System.out.print("B:");
        double sideB = userInput.nextDouble();
        System.out.print("C:");
        double sideC = userInput.nextDouble();
        System.out.println("C**2:" + sideC * sideC);
        System.out.println("B**2:" + sideB * sideB);
        System.out.println("A**2:" + sideA * sideA);
        boolean result = check(sideA, sideB, sideC);
        if (result) {
            System.out.println("Right angled triangle");
        } else {
            System.out.println("Not right angled triangle");
        }

    }

    public static boolean check(double sideA, double sideB, double sideC) {
        if (sideB > sideC) {
            double tmp = sideC;
            sideC = sideB;
            sideB = tmp;
        }
        if (sideA > sideC) {
            double tmp = sideA;
            sideA = sideC;
            sideC = tmp;
        }
        return (sideC * sideC) == ((sideA * sideA) + (sideB * sideB));

    }

}