package com.kitcenter.app.homework.lesson4.utils.convertors;

public class PrimitiveConvertor {

    public void floatToChar(char float2char) {
        float float1 = (char) float2char;
        System.out.println("Input float value is: " + float2char + " Output char value is: " + float1);

    }

    public void intToChar(int intConvChar) {
        int char1 = (char) intConvChar;
        // int charOutput = (char) intInput;
        System.out.println("Input int value is: " + intConvChar + " Output char value is: " + char1);
    }

    public void chartofloat(float char1) {
        float charConv2Float = (char) char1;
        System.out.println("Input char value is: " + char1 + " Output float value is: " + charConv2Float);
    }

    public void charToInt(char charConv2int) {
        int int1 = (char) charConv2int;
        System.out.println("Input char value is: " + charConv2int + " Output int value is: " + int1);
    }
}
