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
            Color color = new RGB(-1,-2,-3);
            square = new ru.nshi.learn.work6.Square(number,color);
        });
    }


    @ParameterizedTest
    @CsvSource({"-1,2,3","1,-1,3","1,2,-1","257,2,3","1,258,3","1,2,259"})
    void testConstructorColorThrows(int color1, int color2, int color3) {
        double number = 5;
        assertThrows(IllegalArgumentException.class, () -> {
            Color color = new RGB(color1,color2,color3);
            square = new ru.nshi.learn.work6.Square(number,color);
            square.setColor(color);
        });
    }
    @ParameterizedTest
    @CsvSource({"2,4", "3,9"})
    void testGetArea(double length, double expectedArea) {
        Color color = new RGB(1,1,1);
        square = new Square(length,color);
        assertEquals(square.getArea() , expectedArea);
    }
}
