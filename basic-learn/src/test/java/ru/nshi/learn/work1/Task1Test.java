package ru.nshi.learn.work1;
//work 1, Task1 test
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {
    Task1 task;

    @BeforeEach
    void setUp() {
        task = new Task1();
    }

    @Test
    void testIsLucky(){
        boolean actual = task.luckyNumber(456654);
        assertTrue(actual);
    }

    @Test
    void testIsNotLucky(){
        boolean actual = task.luckyNumber(456874);
        assertFalse(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {333333, 777777, 111111})
    void testIsLuckyParameterized(int number){
        boolean actual = task.luckyNumber(number);
        assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {626666, 101032, 163063})
    void testIsNotLuckyParameterized(int number){
        boolean actual = task.luckyNumber(number);
        assertFalse(actual);
    }
}
