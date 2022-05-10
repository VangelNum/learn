package ru.nshi.learn.work1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Task3 task = new Task3();
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        System.out.println(task.primeNumber(inputValue));
    }
    public static boolean primeNumber(int number) {
        for( int i = 2; i < number; i++) {
            if( number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
