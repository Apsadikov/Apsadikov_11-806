import java.util.Scanner;

// Вариант №2

public class ClassTask01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // №1
        int n = sc.nextInt();
        int[] array = new int[n * n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sortArr(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // №2
        int[][] matrix = new int[n][n];
        spiralFill(matrix, array);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // №3
        System.out.println(underDiagonalSum(matrix));
    }

    public static int underDiagonalSum(int matrix[][]) {
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n - i) {
                    sum +=matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void spiralFill(int[][] matrix, int[] arr) {
        int n = matrix.length;
        int index = 0;
        int ring = (n / 2 == 0) ? n / 2 : n / 2 + 1;
        for (int r = 0; r < ring; r++) {
            for (int i = r; i < n - r; i++) {
                matrix[r][i] = arr[index];
                index++;
            }

            for (int i = r + 1; i < n - r; i++) {
                matrix[i][n - r - 1] = arr[index];
                index++;
            }

            for (int i = n - r - 2; i > r; i--) {
                matrix[n - r - 1][i] = arr[index];
                index++;
            }

            for (int i = n - r - 1; i > r; i--) {
                matrix[i][r] = arr[index];
                index++;
            }
        }
    }

    public static void sortArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum(arr[i]) > sum(arr[j])) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
    }

    public static int sum(int number) {
        // Сумма цифр числа
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
