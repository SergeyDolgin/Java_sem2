// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000


import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;
import java.io.*;



public class power_difficult { 
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  throws Exception {
        // System.out.println("Введите натуральное число N:");
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String str;
        String strA ="";
        String strB ="";
        while ((str = br.readLine()) != null) {
            if (str.contains("a")){
                strA = str.chars()
                .filter(c -> !Character.isLetter(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining())
                .trim();
            }
            if (str.contains("b")){
                strB = str.chars()
                .filter(c -> !Character.isLetter(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining())
                .trim();
            }
        }
        br.close();
        // System.out.println(strA);
        // System.out.println(strB);
        try (FileWriter fw = new FileWriter ("output.txt", false)) {
            int a = Integer.parseInt(strA);
            int b = Integer.parseInt(strB);       
            // System.out.println("Введите целое число a");
            // int a = getInt();
            // System.out.println("Введите целое число b");
            // int b = getInt();
            if ( a == 0 & b == 0) {
                System.out.println("Значение неопределено");
                fw.write("Значение неопределено");
                fw.append('\n');
            }
            else {
                System.out.printf("a=%d в степени b=%d будет равно %.2f \n", a, b, Math.pow(a, b));
                fw.write(String.format("а = %d, b = %d, ответ: %.2f", a, b, Math.pow(a, b)));
                fw.append('\n');
            }
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
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




