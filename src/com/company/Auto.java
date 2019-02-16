package com.company;

public class Auto {
    int id;
    String number;

    public Auto(int id, String number) {
        this.id = id;
        this.number = number;
    }
    @Override
    public String toString(){
        return "ID: " + id + " Number: " + number;
    }
}
