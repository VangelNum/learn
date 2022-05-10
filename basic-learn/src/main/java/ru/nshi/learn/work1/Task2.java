package ru.nshi.learn.work1;

public class Task2 {
    public static void main(String[] args) {
        Task2 task = new Task2();
        System.out.println(task.sumLuckyNumbers(100000, 1000000));
    }
    public int sumLuckyNumbers(int start, int end) {
        Task1 task1 = new Task1();
        int sum = 0;

        for (int number = start; number < end; number++) {
            if (task1.luckyNumber(number)) {
                sum += number;
            }
        }
        return sum;
    }
}
