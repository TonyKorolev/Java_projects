// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
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

// import java.io.*;
import java.util.Scanner;

public class task001 {
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = iScanner.nextInt();
        System.out.println("Введите b: ");
        int b = iScanner.nextInt();
        iScanner.close();
        // BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        // String str;
        // while ((str = br.readLine()) != null) {
        //     System.out.printf("== %s ==\n", str);
        // }
        // br.close();

        double c = 1;
        double res = 1;
        if (a==0 && b == 0) {
            System.out.println("не определено");
        } else if (b > 0) {
            for (int i = 1; i <= b; i++) {
                c = c*a;
            }
            res = c;
            System.out.println(res);
        } else if (b < 0) {
            b = b*(-1);
            for (int i = 1; i <= b; i++) {
                c = c*a;
            }
            res = 1/c;
            System.out.println(res);
        } else if (b == 0) {
            res = 1;
            System.out.println(res);
        }
    }
}
