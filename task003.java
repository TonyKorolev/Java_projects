// Написать программу вычисления n-ого треугольного числа

import java.util.Scanner;

public class task003 {
    public static void main(String[] args) {
        System.out.println("Программа выдает треугольное число по заданному числу n.");
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите положительное число n: ");
            while (!sc.hasNextInt()) {
                System.out.println("Введите положительное число n: ");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);
        sc.close();
        int answer = FindTriangularNumber(n);
        System.out.println(answer);
        }
    public static int FindTriangularNumber(int a) {
        int res = a*(a+1)/2;
        return res;
    }
}
