public class TaskE {

//    E: Сумма цифр числа
//    Дано натуральное число N. Вычислите сумму его цифр.
//    При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).

    public static void main(String[] args) {
        System.out.println(task(127));
    }

    public static int task(int n) {
        if (n > 0) {
            return ((n % 10) + task(n / 10));
        } else {
            return 0;
        }
    }
}
