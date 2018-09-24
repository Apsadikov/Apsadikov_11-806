public class TaskF {

//    E: Сумма цифр числа
//    Дано натуральное число N. Вычислите сумму его цифр.
//    При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется)

    public static void main(String[] args) {
        task(123);
    }

    public static void task(int n) {
        if (n >= 1) {
            System.out.print(n % 10 + " ");
            task(n / 10);
        }
    }
}
