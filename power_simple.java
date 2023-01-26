// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
import java.util.Scanner;

public class power_simple {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Введите натуральное число N:");
        System.out.println("Введите целое число a");
        int a = getInt();
        System.out.println("Введите целое число b");
        int b = getInt();
        if ( a == 0 & b == 0) {
            System.out.println("Значение неопределено");
        }
        else {
            System.out.printf("a=%d в степени b=%d будет равно %.2f \n", a, b, Math.pow(a, b));
        }
    }


    public static int getInt() {
        while (true) {
            // System.out.println("Введите целое число");
            while (!scanner.hasNextInt()) {
                System.out.println("Вводить нужно целое число");
                scanner.next();
            }
            int temp = scanner.nextInt();
            return temp;
        }
    }
}
// public static double pow (int a, int b) {
//     // if (a ==0 ){
//     //     System.out.println("не определено");
//     // //     break;
//     // }
//     return Math.pow(a, b);
// }

