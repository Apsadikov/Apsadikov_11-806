import java.util.Scanner;

//  № Пользователь с клавиатуры вводит массив целых чисел.
//  Вывести число элементов в самой длинной последовательности из одинаковых чисел в массиве.
//  ({0, 5, 5, 8, 5, 7, 7, 7, 11} → Ответ 3, т. к. три раза подряд встретилось число 7.)

public class LongSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] digits = new int[n];
        int currentResult = 0;
        int lastResult = 0;

        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (digits[i] == digits[i + 1]) currentResult++;
                else currentResult = 0;

            if (currentResult > lastResult) {
                lastResult = currentResult;
            }
        }

        System.out.println("result: " + (lastResult + 1));
    }
}
