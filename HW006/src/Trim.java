import java.util.Scanner;

//  №2 Написать функцию, которая принимает строку в качестве аргумента,
//  удаляет начальные пробелы из строки и возвращает получившуюся строку.
//  (Допустим, ф-ия называется ltrim. String s = ltrim(“  абв”); В s запишется “абв”)

public class Trim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String strResult = "";
        char[] chars = str.toCharArray();

        boolean flag = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ' || !flag) {
                strResult += chars[i];
                flag = false;
            }
        }

        System.out.println(strResult);
    }
}
