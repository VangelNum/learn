package ru.nshi.learn.work2;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Task1 task = new Task1();
        int[] arr = task.createArray(5);
        arr = task.fillArrayByRandom(arr, 10,99);
        task.printArray(arr);
    }

    public int[] createArray(int length) {
        int[] array = new int[length];
        return array;
    }

    public int[] fillArrayByRandom(int[] array, int start, int end) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(end - start + 1) + start ;
        }
        return array;
    }
    public void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }
}
