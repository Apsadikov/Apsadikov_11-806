import java.util.Scanner;

public class TaskK {

//    K: Вывести нечетные числа последовательности
//    Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
//    Выведите все нечетные числа из этой последовательности, сохраняя их порядок.
//    В этой задаче нельзя использовать глобальные переменные и передавать какие-либо параметры в рекурсивную функцию.
//    Функция получает данные, считывая их с клавиатуры. Функция не возвращает значение, а сразу же выводит результат на экран.
//    Основная программа должна состоять только из вызова этой функции.

    public static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        task();
    }

    public static void task() {
        int a = sc.nextInt();
        if (a != 0) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
            task();
        }

    }
}
