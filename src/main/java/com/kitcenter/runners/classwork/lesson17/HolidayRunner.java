package com.kitcenter.runners.classwork.lesson17;

import com.kitcenter.app.classwork.lesson17.Holiday;

public class HolidayRunner {
    public static void main(String[] args) {
        for (Holiday hName : Holiday.values()) {

            System.out.println(hName.getName() + " " + "is on " + hName.getDay() + " " + hName.getMonth());
        }
    }
}
