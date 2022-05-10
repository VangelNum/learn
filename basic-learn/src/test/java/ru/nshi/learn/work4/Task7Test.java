package ru.nshi.learn.work4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class Task7Test {
    Task7 task7;

    @BeforeEach
    void setUp(){task7 = new Task7();}

    @ParameterizedTest
    @CsvSource({"Hey 239040 ksa, 239040", "akdaaaaa 394 asdl2 234lfs, 234lfs"})
    void testMaxUniqueSymbolsInString(String str, String expectedStr){
        String resultStr = task7.maxUniqueSymbolsTrim(str);
        assertEquals(resultStr, expectedStr);
    }

}
