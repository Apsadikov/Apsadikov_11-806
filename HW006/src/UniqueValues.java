import java.util.Scanner;

//  №4 Написать ф-ию, которая принимает массив целых чисел и возвращает true в том случае,
//  если в массиве есть элементы с одинаковым значением,
//  и возвращает false в том случае, если все элементы массива уникальны.

public class UniqueValues {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        System.out.println(isUnique(digits));
    }

    public static Boolean isUnique(int[] array) {
        boolean bool = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    bool = false;
                }
            }
        }

        return bool;
    }
}
