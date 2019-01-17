package com.company;

import java.util.Random;
import java.util.Scanner;

public class Hw2Telegram {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] A = {1, 2, 3, 4, 5, 13, 5};
        System.out.println(evenNumbers(A));
    }

    static int evenNumbers(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 13) {
                return sum;
            } else {
                sum += a[i];
            }
        }
        return sum;

    }

}
