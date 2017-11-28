package com.kitcenter.runners.homework.lesson4.utils.convertors;

import com.kitcenter.app.homework.lesson4.utils.convertors.PrimitiveConvertor;

public class PrimitiveConvertorRunner {
    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor =
                new PrimitiveConvertor();

        //primitiveConvertor.floatToChar(0.999f);
        //primitiveConvertor.intToChar(11868731);
        //primitiveConvertor.chartofloat('h);
        primitiveConvertor.charToInt('c');
    }
}