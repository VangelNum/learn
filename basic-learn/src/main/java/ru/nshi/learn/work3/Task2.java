package ru.nshi.learn.work3;

public class Task2 {
    public static void main(String[] argc) {
        Task2 task = new Task2();
        Task1 task1 = new Task1();
        int[][] arr = task1.createArrays(10);
        arr = task1.fillArrayByRandom(arr,0,99);
        task1.printArray(arr);
        System.out.println("Сумма каждого столбца двумерного массива:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", task.sumColumnsArray(arr, i));
        }
    }
    public int sumColumnsArray(int[][] array,int row) {
        int sum = 0;
        for (int i = 0; i < array[row].length; i++) {
            sum += array[i][row];
        }
        return sum;
    }
}
