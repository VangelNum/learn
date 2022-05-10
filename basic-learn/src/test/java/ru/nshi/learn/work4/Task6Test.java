package ru.nshi.learn.work4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task6Test {
    Task6 task6;

    @BeforeEach
    void setUp(){task6 = new Task6();}

    @Test
    void testMaxUniqueSymbols(){
        String[] strings = {"Anna", "12334", "Pasyuga"};
        String resultStr = task6.maxUniqueSymbolsInString(strings);
        String expectedStr = "Pasyuga";
        assertEquals(resultStr, expectedStr);
    }
}
