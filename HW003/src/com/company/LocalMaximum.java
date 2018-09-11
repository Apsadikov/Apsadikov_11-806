package com.company;

import java.util.Scanner;

// №3 Локальный максимум - элемент, который больше предыдущего и следующего.
// Подсчитать, сколько локальных максимумов во введенном с клавиатуры массиве.

public class LocalMaximum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 1; i < n-1; i++) {
            if (number[i-1] < number[i] && number[i] > number[i+1]) {
                count++;
            }
        }
        System.out.println("count: " + count);
    }
}
