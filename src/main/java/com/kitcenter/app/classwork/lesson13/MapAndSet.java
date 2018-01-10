package com.kitcenter.app.classwork.lesson13;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MapAndSet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, name your category: ");
        String category = scan.nextLine(); // пользовательский ввод - ключ
        System.out.println("Please, put items of your category: ");
        String item = scan.nextLine();// пользовательский ввод - значение
        String[] itemsList = item.split(","); // вводили значение через запятую, поэтому
        // по запятой разделяем и записываем в отдельный массив


        HashSet<String> allItems = new HashSet(); //создаем HashSet, чтобы хранить только уникальные значения ввода
        allItems.addAll(Arrays.asList(itemsList)); // записываем пользовательский ввод значений в созданный HashSet

        HashMap<String, HashSet<String>> option = new HashMap<>();// создаем, чтобы по ключу достучаться до значений
        option.put(category, allItems); //записываем ввод пользователя по связке ключ - значение

        System.out.println("Please, choose a category: "); // хотим достать значения по заданному ключу
        String categoryChoice = scan.nextLine(); // пользовательский ввод названия ключа, который был задан ранее

        HashSet<String> result = option.get(categoryChoice); // создаем новый HashSet,
        // который будет содержать пользовательский ввод
        System.out.println(result);

    }
}
