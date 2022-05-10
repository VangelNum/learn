package ru.nshi.learn.work3;

public class Task3 {
    public static void main(String[] args) {
        Task3 task = new Task3();
        Task1 task1 = new Task1();
        int[][] arr = task1.createArrays(10);
        arr = task1.fillArrayByRandom(arr, 0, 99);
        task1.printArray(arr);
        System.out.printf("Является ли данный массив магическим квадратом? %s",
            (task.checkForMagicSquare(arr) == true));
    }

    public int mainDiagonal(int[][] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j][j];
        }
        return sum;
    }

    public int sideDiagonal(int[][] arr) {
        int sum = 0;
        int i = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
            sum += arr[i][j];
            i += 1;
        }
        return sum;
    }

    public boolean checkForMagicSquare(int[][] arr) {
        Task3 task = new Task3();
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        if (task.mainDiagonal(arr) != task.sideDiagonal(arr))
            return false;

        for (int i = 0; i < arr.length; i++) {
            if((task1.sumRowsArray(arr, i) != task2.sumColumnsArray(arr, i))
                | (task1.sumRowsArray(arr, i) != (task.sideDiagonal(arr)))) {
                return false;
            }
        }
        return true;
    }
}
