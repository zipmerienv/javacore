package com.kitcenter.app.homework.lessson5;


public class Calculator {

    // Static
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    //non-Static
    public int plus(int a, int b) {
        return a + b;
    }

    public int round(float v, float a) {
        return Math.round(a);
    }

    public int abs(int a) {
        return Math.abs(a);
    }

    public float ceil(float a) {
        return (float) Math.ceil(a);
    }

    public int square(int a) {
        return (int) Math.sqrt(a);
    }

    public double floor(double a) {
        return Math.floor(a);
    }

    public double rint(double a) {
        return Math.rint(a);
    }

    public int min(int a, int b) {
        return Math.min(a, b);
    }

    public float max(float a, float b) {
        return Math.min(a, b);
    }

    public int raise2(int a) {
        return a * a;
    }

    public int raise3(int a) {
        return a * a * a;
    }

    public double exp(double a) {
        return Math.exp(a);
    }

    public double tangens(double a) {
        return Math.tan(a);
    }

    public double sinus(double a) {
        return Math.sin(a);
    }

    public double cosinus(double a) {
        return Math.cos(a);
    }

    public double atan(double a) {
        return Math.atan(a);
    }

    public int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

}



