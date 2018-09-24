public class TaskH {

//    H: Проверка числа на простоту
//    Дано натуральное число n>1. Проверьте, является ли оно простым. Программа должна вывести слово YES,
//    если число простое и NO, если число составное. Алгоритм должен иметь сложность O(logn).
//    Указание. Понятно, что задача сама по себе нерекурсивна, т.к. проверка числа n на простоту никак не сводится к проверке
//    на простоту меньших чисел. Поэтому нужно сделать еще один параметр рекурсии: делитель числа, и именно по этому параметру
//    и делать рекурсию.

    public static boolean prime = true;

    public static void main(String[] args) {
        int n = 7;
        if (task(2, n)) System.out.println("Yes");
            else System.out.println("No");
    }

    public static boolean task(int divider, int n) {
        if (n > 1) {
            if (divider < n / 2) {
                if (n % divider == 0) {
                    prime = false;
                } else {
                    task(divider += 1, n);
                }
            }
            return prime;
        }
        return false;
    }
}
