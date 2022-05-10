package ru.nshi.learn.work3;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task4 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task4 task = new Task4();
        int[][] arr = task1.createArrays(10);
        arr = task1.fillArrayByRandom(arr, 0, 99);
        task.convertArray(arr);
    }
    public void convertArray ( int[][] arr){
        int index = 0;
        int[] array2 = new int[100];
        System.out.println("Исходный массив:");
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                arr[i][j] = ThreadLocalRandom.current().nextInt(100 + 1);
                System.out.print(arr[i][j] + " ");
                array2[index++] = arr[i][j];
            }
            System.out.println();
        }

        System.out.println("\nArray2: " + Arrays.toString(array2));

        for (int i = 0; i < array2.length; i++) {
            int min = array2[i];
            int minId = i;
            for (int j = i+1; j < array2.length; j++) {
                if (array2[j] < min) {
                    min = array2[j];
                    minId = j;
                }
            }
            int temp = array2[i];
            array2[i] = min;
            array2[minId] = temp;
        }
        System.out.println("\nArray2: " + Arrays.toString(array2));

        for (int i = 0, k = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                arr[i][j] = array2[k++];
            }
        }
        System.out.println("Результирующий массив: ");
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                System.out.printf("%4s", arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
