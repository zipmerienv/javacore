package com.kitcenter.app.classwork.lesson17;


public enum Holiday {

    NewYear(1, "January", "New Year"), StValentine(14, "February", "St Valentine"), KonstitutionDay(28, "June", "Konstitution Day");
    private int day;
    private String month;
    private String name;

    private Holiday(int day, String month, String name) {
        this.day = day;
        this.month = month;
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

}



