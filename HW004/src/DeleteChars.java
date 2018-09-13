import java.util.Scanner;

//  №3 Пользователь вводит строку и два числа: n1 и n2.
//  Удалить в строке символы с n1-ого по n2-ой, записать результат в String strResult и
//  распечатать значение strResult на консоль.
//  (Например: “abcde”, 1, 3 → “ae”)

public class DeleteChars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strResult = "";
        String str = sc.next();
        char[] chars = str.toCharArray();

        int start = sc.nextInt();
        int finish = sc.nextInt();

        for (int i = 0; i < chars.length; i++) {
            if (i < start || i > finish) {
                strResult += chars[i];
            }
        }

        System.out.println(strResult);
    }
}
