public class TaskI {

//    I: Разложение на множители
//    Дано натуральное число n>1. Выведите все простые множители этого числа в порядке неубывания с учетом кратности.
//    Алгоритм должен иметь сложность O(logn).

    public static int lastPrime = -1;

    public static void main(String[] args) {
        int n = 54;
        task(2, n);
    }

    public static void task(int divider, int n) {
        if (n > 1 && divider <= n) {
            if (n % divider == 0) {

                if (divider != lastPrime) System.out.print(divider + " ");
                lastPrime = divider;
                n /= divider;

            } else {
                divider += 1;
            }
            task(divider, n);
        }
    }
}
