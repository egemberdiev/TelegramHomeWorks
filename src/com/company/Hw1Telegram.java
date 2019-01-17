package com.company;

import java.util.Random;
import java.util.Scanner;

public class Hw1Telegram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 2, 3, 4, 5};
        int[] C = {1, 3, 5, 7, 1};

        System.out.println(evenNumbers(A));
        System.out.println(evenNumbers(B));
        System.out.println(evenNumbers(C));
    }

    static int evenNumbers(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
