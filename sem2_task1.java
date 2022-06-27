// Определение является ли строка полиндромом

import java.util.Scanner;

public class sem2_task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();
        sc.close();
        System.out.println(ReverseString(str));

    }

    public static boolean ReverseString(String str1) {
        String resRev = new StringBuilder(str1).reverse().toString();
        return str1.equals(resRev);
    }
}
