package ru.nshi.learn.work4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class Task5Test {
    Task5 task5;

    @BeforeEach
    void setUp(){task5 = new Task5();}

    @Test
    void testIsCorrectUniqueSymbols(){
        String str = "welrxqww3223wp";
        String strUnique = task5.uniqueSymbols(str);
        String actual = "welrxq32p";
        assertEquals(strUnique, actual);
    }

    @ParameterizedTest
    @CsvSource({"Anna!, An!", "aabbcc123123, abc123"})
    void test2IsCorrectUniqueSymbols(String str, String expectedStr){
        String resultStr = task5.uniqueSymbols(str);
        assertEquals(resultStr, expectedStr);
    }
}
