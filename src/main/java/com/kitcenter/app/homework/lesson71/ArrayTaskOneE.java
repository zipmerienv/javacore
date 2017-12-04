/*Создать двумерный массив
из 8 строк по 5 столбцов в каждой
из случайных целых чисел из отрезка
[10;99]. Вывести массив на экран.*/

package com.kitcenter.app.homework.lesson71;

public class ArrayTaskOneE {

    public static void randomNumMulti() {
        int[][] arrayNew = new int[8][5];
        for (int i = 0; i < arrayNew.length; i++) {
            for (int j = 0; j < arrayNew[i].length; j++) {
                arrayNew[i][j] = (int) (Math.random() * 90) + 10;
                System.out.print(arrayNew[i][j] + " ");
            }
            System.out.println("");
        }
    }
}






