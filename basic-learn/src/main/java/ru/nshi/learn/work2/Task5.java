package ru.nshi.learn.work2;

public class Task5 {
    public static void main(String[] args) {
        Task5 task = new Task5();
        Task1 task1 = new Task1();

        int[] array = task1.createArray(10);
        array = task1.fillArrayByRandom(array, 10, 99);
        task1.printArray(array);
        float average = task.average(array);
        System.out.println("\nСреднее арифметическое элементов = " + average);
    }

    public float average(int[] array) {
        Task3 task3 = new Task3();
        float sum = 0;
        int maxI = task3.getMax(array);
        int minI = task3.getMin(array);
        int count = 0;

        if (minI > maxI) {
            minI = minI + maxI - (maxI = minI);
        }
        for (int i = minI + 1; i < maxI; i++) {
            sum += array[i];
        }
        return sum / (maxI - minI - 1);
    }
}
