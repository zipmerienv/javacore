/*Задачa: 1a
Создайте массив из всех чётных чисел от 2 до 20 и
выведите элементы массива на экран сначала в строку,
отделяя один элемент от другого пробелом, а затем в столбик
(отделяя один элемент от другого началом новой строки).
Перед созданием массива подумайте, какого он будет размера.
        2 4 6 … 18 20
        2
        4
        6
        …
        20*/

package com.kitcenter.app.homework.lesson71;

public class ArrayTaskOneA {
    int[] oddNums = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};


    public void oddNumsToString() {
        for (int arrElement : oddNums) {
            System.out.print(arrElement + " ");
        }
    }

    public void oddNumsToColumn() {
        for (int arrElement : oddNums) {
            System.out.println(arrElement);
        }
    }

}
