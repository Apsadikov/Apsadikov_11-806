import java.util.Scanner;

public class ClassTask02 {
    public static int length;
    public static boolean isPolinrom = true;
    public static char[] chars;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        length = n.length() - 1;
        chars = n.toCharArray();
        System.out.println(recursion(0));
    }

    public static boolean recursion(int index) {
        if (chars[index] != chars[length - index]) {
            isPolinrom = false;
        }
        if (index < length && isPolinrom) {
            recursion(index+=1);
        }
        return isPolinrom;
    }
}
