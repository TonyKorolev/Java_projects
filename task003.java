package seminars;
import java.util.Scanner;

public class task003 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int answer = FindTriangularNumber(n);
        System.out.println(answer);
    }
    public static int FindTriangularNumber(int a) {
        int res = a*(a+1)/2;
        return res;
    }
}
