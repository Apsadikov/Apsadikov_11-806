package com.company;

import java.util.Scanner;

//  №1 n студентов в группе. Вычислить средний рост в группе и количество студентов,
//  чей рост выше среднего. Вводится сначала число студентов, затем по очереди
//  рост каждого.

public class AverageGrowth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int average = 0;
        int n = sc.nextInt();

        int[] growth = new int[n];
        for (int i = 0; i < n; i++) {
            growth[i] = sc.nextInt();
            average += growth[i];
        }

        average /= n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (growth[i] > average) count++;
        }
        System.out.println("average growth: " + average);
        System.out.println("count: " + count);
    }
}
