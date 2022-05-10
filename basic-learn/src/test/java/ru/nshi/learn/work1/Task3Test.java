package ru.nshi.learn.work1;
//work 1, task3 test
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {
    Task3 task3;

    @BeforeEach
    void setUp() {task3 = new Task3();}

    @ParameterizedTest
    @ValueSource(ints = {7, 11, 19})
    void testIsSimple(int number){
        boolean actual = task3.primeNumber(number);
        assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {8, 16, 64})
    void testIsNotSimple(int number){
        boolean actual = task3.primeNumber(number);
        assertFalse(actual);
    }
}
