package com.kitcenter.app.homework.lesson5;

import com.kitcenter.app.homework.lessson5.Calculator;
import org.junit.Assert;
import org.junit.Test;

//1
public class CalculatorTest {
    @Test
    public void multiplyTest() {
        int a = 1, b = 2, expRes = 2;
        Calculator calculator =
                new Calculator();
        Calculator.multiply(a, b);
        int actRes = calculator.multiply(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    //2
    @Test
    public void divideTest() {
        int a = 10, b = 5, expRes = 2;
        Calculator calculator =
                new Calculator();
        Calculator.divide(a, b);
        int actRes = calculator.divide(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    //3
    @Test
    public void minusTest() {
        int a = 10, b = 5, expRes = 5;
        Calculator calculator =
                new Calculator();
        Calculator.minus(a, b);
        int actRes = calculator.minus(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    //4
    @Test
    public void plusTest() {
        int a = 2, b = 2, expRes = 4;
        Calculator calculator =
                new Calculator();
        calculator.plus(a, b);
        int actRes = calculator.plus(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    //5
    @Test
    public void roundTest() {
        float a = 9.9f;
        int expRes = 10;
        Calculator calculator =
                new Calculator();
        calculator.round(a, a);
        int actRes = (int) calculator.round(a, a);
        Assert.assertEquals(expRes, actRes);
    }

    //6
    @Test
    public void absTest() {
        int a = -59;
        int expRes = 59;
        Calculator calculator =
                new Calculator();
        calculator.abs(a);
        int actRes = calculator.abs(a);
        Assert.assertEquals(expRes, actRes);
    }

    //7
    @Test
    public void ceilTest() {
        float a = 3.4f, expRes = 4.0f;
        Calculator calculator =
                new Calculator();
        calculator.ceil(a);
        float actRes = calculator.ceil(a);
        Assert.assertEquals((float) expRes, (float) actRes, (float) actRes - expRes);
    }


    //8
    @Test
    public void squareTest() {
        int a = 25, expRes = 5;
        Calculator calculator =
                new Calculator();
        calculator.square(a);
        int actRes = calculator.square((int) a);
        Assert.assertEquals(expRes, actRes);
    }

    //9
    @Test
    public void floorTest() {
        double a = 7.7;
        int expRes = 7;
        Calculator calculator =
                new Calculator();
        calculator.floor((int) a);
        int actRes = (int) calculator.floor(a);
        Assert.assertEquals(expRes, actRes);

    }

    //10
    @Test
    public void rintTest() {
        double a = 7.797897, expRes = 8.0;
        Calculator calculator =
                new Calculator();
        calculator.rint(a);
        double actRes = calculator.rint(a);
        Assert.assertEquals((double) expRes, (double) actRes, (double) actRes - expRes);

    }

    //11
    @Test
    public void minTest() {
        int a = 237, b = 575, expRes = 237;
        Calculator calculator =
                new Calculator();
        calculator.min(a, b);
        int actRes = calculator.min(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    //12
    @Test
    public void maxTest() {
        float a = 237.78f, b = 575.87f, expRes = 575.87f;
        Calculator calculator =
                new Calculator();
        calculator.max(a, b);
        float actRes = calculator.max(a, b);
        Assert.assertEquals((float) expRes, (float) actRes, (float) expRes - actRes);
    }

    //13
    @Test
    public void raise2Test() {
        int a = 2, expRes = 4;
        Calculator calculator =
                new Calculator();
        calculator.raise2(a);
        int actRes = calculator.raise2(a);
        Assert.assertEquals(expRes, actRes);
    }

    //14
    @Test
    public void raise3Test() {
        int a = 2, expRes = 8;
        Calculator calculator =
                new Calculator();
        calculator.raise3(a);
        int actRes = calculator.raise3(a);
        Assert.assertEquals(expRes, actRes);
    }

    //15
    @Test
    public void expTest() {
        double a = 1.635, expRes = 112983.831;
        Calculator calculator =
                new Calculator();
        calculator.exp(a);
        double actRes = calculator.exp(a);
        Assert.assertEquals((double) expRes, (double) actRes, (double) expRes - actRes);
    }

    //16
    @Test
    public void tangensTest() {
        double a = 0.00, expRes = 0.00;
        Calculator calculator =
                new Calculator();
        calculator.tangens(a);
        double actRes = calculator.tangens(a);
        Assert.assertEquals((double) expRes, (double) actRes, (double) expRes - actRes);
    }

    //17
    @Test
    public void sinusTest() {
        double a = 0.00, expRes = 0.00;
        Calculator calculator =
                new Calculator();
        calculator.sinus(a);
        double actRes = calculator.sinus(a);
        Assert.assertEquals((double) expRes, (double) actRes, (double) expRes - actRes);
    }

    //18
    @Test
    public void cosinusTest() {
        double a = 0.00, expRes = 1.00;
        Calculator calculator =
                new Calculator();
        calculator.cosinus(a);
        double actRes = calculator.cosinus(a);
        Assert.assertEquals((double) expRes, (double) actRes, (double) expRes - actRes);
    }

    //19
    @Test
    public void atanTest() {
        double a = 0.00, expRes = 0.00;
        Calculator calculator =
                new Calculator();
        calculator.atan(a);
        double actRes = calculator.atan(a);
        Assert.assertEquals((double) expRes, (double) actRes, (double) expRes - actRes);
    }

    //20
    @Test
    public void powTest() {
        int a = 2, b = 2, expRes = 4;
        Calculator calculator =
                new Calculator();
        calculator.pow(a, b);
        int actRes = calculator.pow(a, b);
        Assert.assertEquals(expRes, actRes);
    }
}



