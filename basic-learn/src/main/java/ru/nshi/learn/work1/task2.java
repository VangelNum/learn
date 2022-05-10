package ru.nshi.learn.work1;

/*Написать программу, которая вычисляет, сумму всех шестизначных «счастливых» чисел.*/

public class Task2 {
    public static void main(String[] args){
        Task2 task_2 = new Task2();
        System.out.println(task_2.summaAllLuckyNumbers());
    }

    public int summaAllLuckyNumbers() {
        int sum = 0;
        Task2 task = new Task2();
        for (int i = 100000; i <= 999999; i++){
            if (task.lucky(i) == true) {
                sum += i;
            } 
        }
        return sum;
    }
}
