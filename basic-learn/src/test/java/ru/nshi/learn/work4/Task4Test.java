package ru.nshi.learn.work4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class Task4Test {
    Task4 task4;

    @BeforeEach
    void setUp(){task4 = new Task4();}

    @Test
    void testSumDigitsInString(){
        String str = "alfd238;asc23-A37";
        int sumDigits = task4.sumNumbersInString(str);
        int expectedSum= 2+3+8+2+3+3+7;
        assertEquals(sumDigits, expectedSum);
    }

    @ParameterizedTest
    @CsvSource({"ald381;s, 12", "H1 Wer230, 6"})
    void test2SumDigitsInString(String str, int expectedSum){
        int sumDigits = task4.sumNumbersInString(str);
        assertEquals(sumDigits, expectedSum);
    }
}
