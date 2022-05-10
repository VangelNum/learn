package ru.nshi.learn.work2;
public class Task2 {
    public static void main(String[] args) {
        Task2 task = new Task2();
        Task1 task1 = new Task1();
        int[] array = task1.createArray(10);
        array = task1.fillArrayByRandom(array, -50, 50);
        task1.printArray(array);
        System.out.println("\n" + task.sumOfPositiveElements(array));
    }
    public int sumOfPositiveElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
