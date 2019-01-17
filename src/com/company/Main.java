package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] A = {1, 2, 3, 4, 5, 5, 12};
        int[] B = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(evenNumbers(A));
        System.out.println(evenNumbers(B));
    }

    static boolean evenNumbers(int[] a) {
        boolean twin = false;
        for (int i = 1; i < a.length; i++) {
            if(a[i - 1] == a[i]){
                twin = true;
            }
        }
        return twin;
    }
}
