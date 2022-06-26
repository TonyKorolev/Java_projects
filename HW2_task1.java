public class HW2_task1 {
    public static void main(String[] args) {
        int[] arr = { 87, 65, 30, 55, 43, 9, 38, 44, 11, 72 };
        int N = 38;
        // int N = 1;
        int[] arrSort = selectionSort(arr);
        PrintArray(arrSort);
        int pos = binarySearch(arrSort, N);
        if (pos == -1) {
            System.out.printf("Число %d в массиве не найдено!", N);
        } else {
            System.out.printf("Число %d в массиве под номером %d", N, pos);
        }
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        return arr;
    }

    public static int binarySearch(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;
        }
        return -1;
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
