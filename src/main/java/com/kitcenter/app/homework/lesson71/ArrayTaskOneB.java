/*Задание 1b
Создайте массив из всех нечётных чисел
от 1 до 99, выведите его на экран в строку,
а затем этот же массив выведите на экран
в другую строку, но в обратном порядке
(99 97 95 93 … 7 5 3 1).
*/
package com.kitcenter.app.homework.lesson71;

public class ArrayTaskOneB {

    public static void main() {
        int evenCount = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) evenCount++;
        }

        int[] evenToString = new int[evenCount];
        for (int i = 1, num = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                evenToString[num] = i;
                System.out.print(evenToString[num] + " ");
            }
        }

        System.out.println("");

        for (int i = 99, num = evenToString.length - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                evenToString[num] = i;
                System.out.print(evenToString[num] + " ");
            }
        }

    }
}
