package ru.nshi.learn.work2;

public class Task3 {
    public static void main(String[] args) {
        Task3 task = new Task3();
        Task1 task1 = new Task1();
        int[] array = task1.createArray(10);
        array = task1.fillArrayByRandom(array, 10, 99);
        task1.printArray(array);
        int max = getMax(array);
        System.out.println();
        System.out.println("Максимальное значение = " + array[max]);
        int min = getMin(array);
        System.out.println("Минимальное значение = " + array[min]);
    }

    public static int getMax(int[] array) {
        int maxNumber = array[0];
        int maxI = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                maxI = i;
            }
        }
        return maxI;
    }

    public static int getMin(int[] array) {
        int minI = 0;
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
                minI = i;
            }
        }
        return minI;
    }

}
