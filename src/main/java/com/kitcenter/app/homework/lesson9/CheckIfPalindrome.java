package com.kitcenter.app.homework.lesson9;

public class CheckIfPalindrome {

    public static void isPalindrom() {
        String value = "cook";
        boolean isPalindrom = true;
        for (int i = 0; i < (value.length()) / 2; i++) {
            isPalindrom = isPalindrom && (value.charAt(i) == value.charAt(value.length() - i - 1));
        }
        if (isPalindrom) {
            System.out.println("Word " + value + "is a palindrom");
        } else {
            System.out.println("Word " + value + "is not a palindrom");
        }
    }
}