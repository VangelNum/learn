package ru.nshi.learn.work2;

public class Task4 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task3 task3 = new Task3();

        int[] array = task1.createArray(10);
        array = task1.fillArrayByRandom(array, 10,99);
        task1.printArray(array);
        int max = task3.getMax(array);
        System.out.println();
        System.out.println("Максимальное значение = " + array[max]);
        int min = task3.getMin(array);
        System.out.println("Минимальное значение = " + array[min]);
        int repl = array[max];
        array[max] = array[min];
        array[min] = repl;
        task1.printArray(array);
    }
}
