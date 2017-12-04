/* Задание 1с
Создайте массив из 15 случайных целых
чисел из отрезка [0;9]. Выведите массив на экран.
Подсчитайте сколько в массиве чётных элементов и
выведете это количество на экран на отдельной строке.*/

package com.kitcenter.app.homework.lesson71;

import java.util.Random;

public class ArrayTaskOneC {

    public static void randomNum() {
        int a = 0;
        int[] arrayNew = new int[15];
        for (int i = 0; i < arrayNew.length; i++) {
            Random integ = new Random();
            arrayNew[i] = integ.nextInt(10);
            System.out.print(arrayNew[i] + " ");
            if (arrayNew[i] > 0 & arrayNew[i] % 2 == 0) a++;
        }
        System.out.println("");
        System.out.println("Всего в массиве " + a + " четных");
    }
}