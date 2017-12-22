package com.kitcenter.app.homework.lesson11;


public class WhiteCollar extends Human {

    private String company;

    public WhiteCollar(int age, String name, String company) {
        super(age, name);
        this.company = company;
    }

    public void setCompany(String company) {

        if (company.matches("^[A-Za-z_0-9 -]{3,15}$")) {
            this.company = company;
        } else
            System.out.println("Company name is invalid");
    }

    public void getCompany() {
        System.out.println(company);
    }
}
