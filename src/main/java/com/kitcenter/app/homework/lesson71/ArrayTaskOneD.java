/* Задание 1 d
Создайте массив из 15 случайных целых чисел из отрезка [0;999].
Выведите массив на экран.
Выведите минимальное и максимальное значение элементов массива*/

package com.kitcenter.app.homework.lesson71;

import java.util.Random;

public class ArrayTaskOneD {

    public static void randomNum() {
        int a = 0;
        int[] arrayNew = new int[15];
        for (int i = 0; i < arrayNew.length; i++) {
            Random integ = new Random();
            arrayNew[i] = integ.nextInt(1000);
            System.out.print(arrayNew[i] + " ");
            if (arrayNew[i] > 0 & arrayNew[i] % 2 == 0) a++;
            System.out.println("");

        }
        int max = arrayNew[0];
        int min = arrayNew[0];
        for (int i = 0; i < arrayNew.length; i++) {
            if (arrayNew[i] > max) {
                max = arrayNew[i];
            }
            if (arrayNew[i] < min) {
                min = arrayNew[i];
            }
        }
        System.out.println("Min num - " + min + " max num - " + max);
    }
}




