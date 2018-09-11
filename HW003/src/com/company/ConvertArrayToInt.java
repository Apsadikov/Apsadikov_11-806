package com.company;

import java.util.Scanner;

//  №5 Есть массив вида {3, 4, 2, 11, 133}. Получить int x, равный 34211133.

public class ConvertArrayToInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        String str = "";
        for (int i = 0; i < n; i++) {
            str += number[i];
        }

        System.out.println(Integer.parseInt(str));
    }
}
