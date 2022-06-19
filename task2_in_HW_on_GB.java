// Написать программу возвращающее число, 
// которое без остатка делится на сумму цифр этого числа.

package seminars;

public class task2_in_HW_on_GB {
    public static void main(String[] args) {
        // записываем массив искомых чисел
        int[] numArr = ArrayNumbers();
        // вывод массива, при необходимости убрать "комментирование" в начале следующей
        // строки
        // PrintArray(numArr);
        // рандомное число из промежутка от 0 до длины массива
        int number = RandomNumber(numArr.length);
        // вывод искомого рандомного числа из массива
        System.out.println(numArr[number]);
    }

    // метод возвращает рандомное число от 0 до числа "а" не включая
    public static int RandomNumber(int a) {
        int N = (int) (Math.random() * a);
        return N;
    }

    // Метод находит длину массива и записывает в этот массив числа,
    // которые делятся на сумму его цифр без остатка.
    // При необходимости можно увеличить количество чисел,
    // для этого нужно в обоих местах изменить 101 на большее число
    public static int[] ArrayNumbers() {
        int length = 0;
        for (int i = 10; i < 101; i++) {
            if (i % SumDigits(i) == 0) {
                length++;
            }
        }
        int[] arrNum = new int[length];
        int j = 0;
        for (int i = 10; i < 101; i++) {
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
