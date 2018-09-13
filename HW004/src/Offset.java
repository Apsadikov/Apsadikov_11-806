import java.util.Scanner;

//  №2 Пользователь вводит строку и положительное число.
//  Выполнить циклический сдвиг символов в строке на введенное число знаков вправо.
//  (Например, “abcde” и 2 → “deabc”)

public class Offset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int offset = sc.nextInt();

        if (offset >= str.length()) offset %= str.length();
        char[] chars = str.toCharArray();
        char[] newChars = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (offset + i > chars.length - 1) {
                newChars[offset + i - chars.length] = chars[i];
            } else {
                newChars[i + offset] = chars[i];
            }
        }
        System.out.println(newChars);
    }
}
