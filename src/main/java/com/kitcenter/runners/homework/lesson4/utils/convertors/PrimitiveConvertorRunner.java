package com.kitcenter.runners.homework.lesson4.utils.convertors;

import com.kitcenter.app.homework.lesson4.utils.convertors.PrimitiveConvertor;

public class PrimitiveConvertorRunner {
    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor =
                new PrimitiveConvertor();
        primitiveConvertor.floatToChar(90.9f);
        primitiveConvertor.intToChar(212);
        primitiveConvertor.chartofloat('z');
        primitiveConvertor.charToInt('a');
        primitiveConvertor.intToFloat(7);
        primitiveConvertor.floatToDouble(87.9978987f);
    }
}