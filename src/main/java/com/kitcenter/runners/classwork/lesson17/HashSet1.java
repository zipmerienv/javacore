package com.kitcenter.runners.classwork.lesson17;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input 6 elements to create your SET: ");
        //String sting1 = scan.nextLine();

        HashSet hs = new HashSet();

        hs.add(scan.nextLine());
        hs.add(scan.nextLine());
        hs.add(scan.nextLine());
        hs.add(scan.nextLine()); // не распознается метод, понять, почему

        System.out.println(hs);
    }

}
