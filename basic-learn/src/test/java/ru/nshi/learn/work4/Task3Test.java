package ru.nshi.learn.work4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {
    Task3 task3;

    @BeforeEach
    void setUp(){task3 = new Task3();}

    @Test
    void testArrayOfDigits(){
        String string = "ASL2sd,a03s;39@1";
        int countDigitsInStr = task3.countNumbersInArray(string);
        char[] newStr = task3.numbersArray(string, countDigitsInStr);
        char[] actual = {'2', '0', '3', '3', '9', '1'};
        assertArrayEquals(newStr, actual);
    }

}
