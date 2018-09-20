import java.util.Scanner;

//  №1 Отсортировать массив строк по возрастанию их длины .

public class SortByLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            strArray[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (strArray[j].length() > strArray[j + 1].length()) {
                    String buffer = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = buffer;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(strArray[i]);
        }
    }
}
