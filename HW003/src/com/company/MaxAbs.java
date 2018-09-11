package com.company;

import java.util.Scanner;

//  №2 Вывести индекс максимального по модулю элемента в массиве.

public class MaxAbs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        int max = 0;
        int index = 0;

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (Math.abs(number[i]) > max) {
                max = Math.abs(number[i]);
                index = i;
            }
        }

        System.out.println("Index: " + index);
    }
}
