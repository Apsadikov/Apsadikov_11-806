import java.util.Scanner;

//  №1 Два целочисленных массива. Найти первое вхождение второго массива в первом массиве
//  и вывести индекс эл-та, с которого оно начинается.
//  (Например, {1, 2, 3, 4, 2, 3, 4} и {2, 3, 4} → Ответ: 1)

public class Occurrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] aAray = new int[a];
        int[] bAray = new int[b];

        for (int i = 0; i < a; i++) {
            aAray[i] = sc.nextInt();
        }

        for (int i = 0; i < b; i++) {
            bAray[i] = sc.nextInt();
        }

        boolean find = false;
        int count = 0;
        int index = -1;
        for (int i = 0; i < a; i++) {
            for (int j = count; j < b ; j++) {
                if (!find) {
                    if (aAray[i] == bAray[j]) {
                        count++;
                        find = true;
//                        System.out.println("Элементы aArray[" + i + "]=" + aAray[i] + " и bArray[" + j + "]=" + bAray[j] + " равны");
                        if (count == b) {
                            index = i - b + 1;
                        }
                    } else {
                        count = 0;
//                        System.out.println("Элементы aArray[" + i + "]=" + aAray[i] + " и bArray[" + j + "]=" + bAray[j] + " не равны");
                    }
                }
            }
            find = false;
        }

        System.out.println("Index: " + index);
    }
}
