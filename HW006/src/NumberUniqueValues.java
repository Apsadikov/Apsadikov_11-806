import java.util.Scanner;

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

        System.out.println(a + b - 2*count);
    }
}
