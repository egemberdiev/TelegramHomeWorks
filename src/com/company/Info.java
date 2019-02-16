package com.company;

public class Info {
    String dateOfCreation;
    String model;
    double price;
    String color;
    Auto auto;

    public Info(String dateOfCreation, String model, double price, String color, Auto auto) {
        this.dateOfCreation = dateOfCreation;
        this.model = model;
        this.price = price;
        this.color = color;
        this.auto = auto;
    }

    @Override
    public String toString(){
        return "Date of creation: " + dateOfCreation + " Model: " + model +
                " Price: " + price + " Color: " + color;
    }
}
