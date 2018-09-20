import java.util.Scanner;

//  №5 Пользователь с клавиатуры вводит два массива произвольной длины.
//  И 1-ый, и 2-ой массивы по отдельности содержат только уникальные значения,
//  но могут быть такие значения, которые встречаются и в 1-ом, и во 2-ом массиве.
//  Вывести на экран общее число таких элементов,
//  которые содержатся только в одном массиве, но отсутствуют в другом массиве.

public class NumberUniqueValues {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arrayA = new int[a];
        int[] arrayB = new int[b];

        for (int i = 0; i < a; i++) {
            arrayA[i] = sc.nextInt();
        }

        for (int i = 0; i < b; i++) {
            arrayB[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (arrayA[i] == arrayB[j]) {
                    count++;
                }
            }
        }

        System.out.println(a + b - 2 * count);
    }
}
