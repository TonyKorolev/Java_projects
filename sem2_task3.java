// Вывести массив всех чисел в заданном интервале, которые делятся на сумму цифр этого числа

import java.util.Scanner;

public class sem2_task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите начальное значение интервала: ");
        int a = sc.nextInt();
        System.out.println("Введите конечное значение интервала: ");
        int b = sc.nextInt();
        sc.close();
        PrintArray(SumDigArray(a, b));
    }

    // Метод находит длину массива и записывает в этот массив числа,
    // которые делятся на сумму его цифр без остатка в интервале от start до end.

    public static int[] SumDigArray(int start, int end) {
        int length = 0;
        for (int i = start; i < end+1; i++) {
            if (i % SumDigits(i) == 0) {
                length++;
            }
        }
        int[] arrNum = new int[length];
        int j = 0;
        for (int i = start; i < end+1; i++) {
            if (i % SumDigits(i) == 0) {
                arrNum[j] = i;
                j++;
            }
        }
        return arrNum;
    }

    // метод находит сумму цифр числа
    public static int SumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }

    // метод для вывода массива
    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }    
}
