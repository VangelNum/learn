package ru.nshi.learn.work3;
import java.util.Random;

public class Task1 {
    public static void main(String[] argc) {
        Task1 task1 = new Task1();
        int[][] arr = task1.createArrays(10);
        arr = task1.fillArrayByRandom(arr, 0,99);
        task1.printArray(arr);

        System.out.println("Сумма каждой строки двумерного массива:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", task1.sumRowsArray(arr, i));
        }
    }

    public int[][] createArrays(int length) {
        int[][] array = new int[length][length];
        return array;
    }

    public int[][] fillArrayByRandom(int[][] array, int start, int end) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt((end - start) + 1) + start;
            }
        }
        return array;
    }

    public void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d" , array[i][j]);
            }
            System.out.println();
        }
    }

    public int sumRowsArray(int[][] array, int column) {
        int sum = 0;
        for (int j = 0; j < array[column].length; j++) {
            sum += array[column][j];
        }
        return sum;
    }
}
