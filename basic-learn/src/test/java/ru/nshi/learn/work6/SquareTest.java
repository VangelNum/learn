package ru.nshi.learn.work6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    Square square;

    @Test
    void testConstructor(){
        double number = -5;
        assertThrows(IllegalArgumentException.class, () ->
        {
            Colour colour = new RGB(-1,-2,-3);
            square = new ru.nshi.learn.work6.Square(number,colour);
        });
    }


    @ParameterizedTest
    @CsvSource({"-1,2,3","1,-1,3","1,2,-1","257,2,3","1,258,3","1,2,259"})
    void testConstructorColorThrows(int colour1, int colour2, int colour3) {
        double number = 5;
        assertThrows(IllegalArgumentException.class, () -> {
            Colour colour = new RGB(colour1,colour2,colour3);
            square = new ru.nshi.learn.work6.Square(number,colour);
            square.setColor(colour);
        });
    }
    @ParameterizedTest
    @CsvSource({"2,4", "3,9"})
    void testGetArea(double length, double expectedArea) {
        Colour colour = new RGB(1,1,1);
        square = new Square(length,colour);
        assertEquals(square.getArea() , expectedArea);
    }
}
