package com.kitcenter.app.homework.lesson4.utils.convertors;

public class PrimitiveConvertor {

    //вроде бы, работает)
    public void floatToChar(float float1) {
        float float2char = (char) float1;
        System.out.println("Input float value is: " + float1 + " Output char value is: " + float2char);
    }

    //вроде бы, работает)
    public void intToChar(int intInput) {
        int charOutput = (char) intInput;
        System.out.println("Input int value is: " + intInput + " Output char value is: " + charOutput);
    }

    // работает
    public void chartofloat(char charConv2Float) {
        float float1 = (char) charConv2Float;
        System.out.println("Input char value is: " + charConv2Float + " Output float value is: " + float1);
    }

    // работает
    public void charToInt(char charConv2int) {
        int int1 = (char) charConv2int;
        System.out.println("Input char value is: " + charConv2int + " Output int value is: " + int1);
    }

    // работает
    public void intToFloat(int whatIsConverted) {
        float int2 = (int) whatIsConverted;
        System.out.println("Input int value is: " + whatIsConverted + " Output float value is: " + int2);
    }

    // работает
    public void floatToDouble(float floatIsConverted) {
        double int3 = (float) floatIsConverted;
        System.out.println("Input float value is: " + floatIsConverted + " Output double value is: " + int3);
    }
}