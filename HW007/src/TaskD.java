public class TaskD {

//    D: Точная степень двойки
//    Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
//    Операцией возведения в степень пользоваться нельзя!

    public static void main(String[] args) {
        if (task(256) == 1) System.out.println("Yes");
            else System.out.println("No");
    }

    public static int task(int a) {
        if (a >= 1) {
            if (a % 2 == 0) {
                return task(a / 2);
            } else if (a == 1) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}