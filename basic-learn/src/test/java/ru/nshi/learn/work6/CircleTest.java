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
            Color color = new RGB(-1,-2,-3);
            circle = new ru.nshi.learn.work6.Circle(diagonal,color);
        });
    }


    @ParameterizedTest
    @CsvSource({"-1,2,3","1,-1,3","1,2,-1","257,2,3","1,258,3","1,2,259"})
    void testConstructorColorThrows(int color1, int color2, int color3) {
        double diagonal = 5;
        assertThrows(IllegalArgumentException.class, () -> {
            Color color = new RGB(color1,color2,color3);
            circle = new ru.nshi.learn.work6.Circle(diagonal,color);
            circle.setColor(color);
        });
    }
    @ParameterizedTest
    @CsvSource({"6,28.26", "8,50.24"})
    void testGetArea(double diagonal,double expectedArea) {
        Color color = new RGB(1,1,1);
        circle = new Circle(diagonal,color);
        assertEquals(circle.getArea() , expectedArea);
    }
}
