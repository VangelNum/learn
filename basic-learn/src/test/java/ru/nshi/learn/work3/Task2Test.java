package ru.nshi.learn.work3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {
        Task2 sumColumnArray;
        @BeforeEach
        void setUp() {
            sumColumnArray = new Task2();
        }

        @Test
        void testSumColumnDoubleMatrixTrue() {
            int arr[][][] = {
                {{12, 19}, {-36, -29}},
                {{-8, -83, -23}, {-8, 72, -48}, {-90, -86, 90}}
            };
            int size[] = {2, 3};
            int sum[][] = {{-24,-10}, {-106, -97, 19}};
            for (int i = 0; i < size.length; i++) {
                for (int j = 0; j < size[i]; j++) {
                    assertTrue(sumColumnArray.sumColumnsArray(arr[i], j) == sum[i][j]);
                }
            }
        }

        @Test
        void testSumColumnDoubleMatrixFalse() {
            int arr[][][] = {
                {{28, -58}, {60, -87}},
                {{18, -82, 28}, {-84, -76, 69}, {15, 91, -88}}
            };
            int size[] = {2, 3};
            int sum[][] = {{31,-7}, {-114, 16, -86}};
            for (int i = 0; i < size.length; i++) {
                for (int j = 0; j < size[i]; j++) {
                    assertFalse(sumColumnArray.sumColumnsArray(arr[i], j) == sum[i][j]);
                }
            }
        }
}
