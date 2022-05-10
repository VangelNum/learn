package ru.nshi.learn.work6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    Circle circle;

    @Test
    void testConstructor(){
        double diagonal = -5;

        assertThrows(IllegalArgumentException.class, () ->
        {
            Colour colour = new RGB(-228,-1337,-199);
            circle = new ru.nshi.learn.work6.Circle(diagonal,colour);
        });
    }


    @ParameterizedTest
    @CsvSource({"-1,2,3","1,-1,3","1,2,-1","257,2,3","1,258,3","1,2,259"})
    void testConstructorColorThrows(int colour1, int colour2, int colour3) {
        double diagonal = 5;
        assertThrows(IllegalArgumentException.class, () -> {
            Colour colour = new RGB(colour1,colour2,colour3);
            circle = new ru.nshi.learn.work6.Circle(diagonal,colour);
            circle.setColor(colour);
        });
    }
    @ParameterizedTest
    @CsvSource({"6,28.26", "8,50.24"})
    void testGetArea(double diagonal,double expectedArea) {
        Colour colour = new RGB(1,1,1);
        circle = new Circle(diagonal,colour);
        assertEquals(circle.getArea() , expectedArea);
    }
}
