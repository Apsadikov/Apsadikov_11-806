public class TaskJ {

//    J: Палиндром
//    Дано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово палиндромом. Выведите YES или NO.
//    При решении этой задачи нельзя пользоваться циклами, в решениях на питоне нельзя использовать срезы с шагом, отличным от 1.

    public static boolean palindrome = true;

    public static void main(String[] args) {
        String str = "abcba";
       if (task(0, str)) System.out.println("Yes");
           else System.out.println("No");
    }

    public static boolean task(int index, String str) {
        if (index < str.length() / 2) {
            if (str.charAt(index) == str.charAt(str.length() - index - 1) && palindrome) {
                task(index += 1, str);
            } else {
                palindrome = false;
            }
        }
        return palindrome;
    }
}
