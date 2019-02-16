package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        DatabaseConnector db = new DatabaseConnector();

        for (Map.Entry<Auto, Info> pairs : db.getAuto().entrySet()) {
            System.out.println(pairs.getKey() + " - " + pairs.getValue());
        }
    }
}
