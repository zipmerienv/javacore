package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.app.homework.lesson12.Bicycle;
import com.kitcenter.app.homework.lesson12.BicycleWithRing;
import com.kitcenter.app.homework.lesson12.BicycleWithRingInterface;
import com.kitcenter.app.homework.lesson12.CustomBicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        BicycleWithRingInterface bicycle = new BicycleWithRing();
        bicycle.ring();

        Bicycle newOne = new CustomBicycle();
        newOne.setGear(56);
        newOne.ride();
    }
}
