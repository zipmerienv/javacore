package com.kitcenter.runners.classwork.lesson17;
//ArrayList add

import java.util.ArrayList;

public class RunnerArrayList {
    public static void main(String[] args) {
        ArrayList<String> myList =
                new ArrayList();//создаем объект типа ArrayList, закрытый стрингами???

        String string1 = "element1";
        myList.add(string1);//добавляем элемент типа стринг в массив
        String string2 = "element2";
        myList.add(string2);
        int theSize = myList.size();// с помощью метода size узнаем длину массива
        System.out.println(theSize);// узнаем размер после добавления второго элемента
        myList.remove(1);// убираем объект под определенным индексом
        int theSize2 = myList.size();// узнаем размер после удаления объекта
        System.out.println(theSize2);
        boolean isIn = myList.contains("element1");
        System.out.println("содержит ли element1: " + isIn);
        boolean isEmpty = myList.isEmpty();
        System.out.println("is array empty: " + isEmpty);
        int indexOfEl = myList.indexOf("element1");
        System.out.println("element1 под индексом: " + indexOfEl);
        String x = myList.get(0);
        System.out.println("под индексом 0 находится: " + x);

    }
}
