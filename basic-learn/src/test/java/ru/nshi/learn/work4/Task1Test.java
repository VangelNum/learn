package ru.nshi.learn.work4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {
    ru.nshi.learn.work4.Task1 task1;

    @BeforeEach
    void setUp(){task1 = new ru.nshi.learn.work4.Task1();}

    @ParameterizedTest
    @CsvSource({"0,T", "1,Ta", "2,Tas", "3,Task","4,Task1"})
    void testIsCorrectStings(int index, String actual){
        String[] resultes = task1.stringArray("Task1");
        assertEquals(actual, resultes[index]);
    }
}
