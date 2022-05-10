package ru.nshi.learn.work3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {
    Task1 sumRowArray;
    @BeforeEach
    void setUp() {
        sumRowArray = new Task1();
    }

    @Test
    void testSumRowDoubleMatrix() {
        int arr[][][] = {
            {{1, 1}, {-5, -4}},
            {{5, -3, 45}, {1, 55, 55}, {1, 2, 3}}
        };
        int size[] = {2, 3};
        int sum[][] = {{2,-9}, {47, 111, 6}};
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size[i]; j++) {
                assertTrue(sumRowArray.sumRowsArray(arr[i], j) == sum[i][j]);
            }
        }
    }

    @Test
    void testSumRowDoubleMatrixFalse() {
        int arr[][][] = {
            {{2, -8}, {6, -7}},
            {{88, 42, 2}, {-4, 56, 69}, {15, 91, -88}}
        };
        int size[] = {2, 3};
        int sum[][] = {{31,-7}, {-114, 16, -86}};
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size[i]; j++) {
                assertFalse(sumRowArray.sumRowsArray(arr[i], j) == sum[i][j]);
            }
        }

    }
}
