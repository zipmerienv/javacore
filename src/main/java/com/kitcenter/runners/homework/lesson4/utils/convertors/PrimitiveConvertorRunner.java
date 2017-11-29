package com.kitcenter.runners.homework.lesson4.utils.convertors;

import com.kitcenter.app.homework.lesson4.utils.convertors.PrimitiveConvertor;

public class PrimitiveConvertorRunner {
    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor =
                new PrimitiveConvertor();
        primitiveConvertor.floatToChar(1.9f);
        primitiveConvertor.intToChar(2153);
        primitiveConvertor.chartofloat('c');
        primitiveConvertor.charToInt('c');
    }
}