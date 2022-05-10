package ru.nshi.learn.work4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {
    ru.nshi.learn.work4.Task2 task2;

    @BeforeEach
    void setUp(){task2 = new ru.nshi.learn.work4.Task2();}

    @ParameterizedTest
    @CsvSource({"Hi456, H", "124GGy, GG", "34KDFaldSSS, KDFSSS"})
    void testIsCorrectUpperCase(String str, String actual){
        String resultFunction = task2.stringOnlyUpperCase(str);
        assertEquals(resultFunction, actual);
    }

}
