package ru.nshi.learn.work1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 task = new Task1();
        System.out.println("Enter a six-digit number: ");
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();

        System.out.println(task.luckyNumber(inputValue));
    }
    public static boolean luckyNumber(int number) {
        return number/100000 + number/10000%10 + number/1000%10 == number/100%10 +number/10%10 +number%10;
    }
}
