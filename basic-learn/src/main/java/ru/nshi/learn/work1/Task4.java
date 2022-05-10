package ru.nshi.learn.work1;
public class Task4 {
    public static void main(String[] args) {
        Task4 task = new Task4();
        System.out.println(task.sumPrimeNumbers(1000, 2000));
    }
    public int sumPrimeNumbers(int start, int end) {
        Task3 task3 = new Task3();
        int sum = 0;

        for (int number = start; number < end; number++) {
            if (task3.primeNumber(number)) {
                sum += number;
            }
        }
        return sum;
    }
}
