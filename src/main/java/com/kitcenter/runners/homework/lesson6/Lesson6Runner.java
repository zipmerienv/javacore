package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.homework.lesson6.BiggerNum;
import com.kitcenter.app.homework.lesson6.EvenOrOdd;
import com.kitcenter.app.homework.lesson6.Triangle;

import java.util.Scanner;

public class Lesson6Runner {
    public static void main(String[] args) {
        System.out.println("Pls select program to start");
        System.out.println("To run triangle check input 1");
        System.out.println("To run Even or Odd input 2");
        System.out.println("To run What number bigger input 3");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                Triangle.triangle();
                break;
            case 2:
                EvenOrOdd.evenOrOdd();
                break;
            case 3:
                BiggerNum.bigger();
                break;
            default:
                System.out.println("Nothing to do here");
        }
    }
}

