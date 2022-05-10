package ru.nshi.learn.work6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    Triangle triangle;

    @Test
    void testConstructor(){
        double sides1 = -5;
        double sides2 = 15;
        double sides3 = 20;

        assertThrows(IllegalArgumentException.class, () ->
        {
            Color color = new RGB(-1,-2,-3);
            triangle = new ru.nshi.learn.work6.Triangle(sides1,sides2,sides3,color);
        });
    }


    @ParameterizedTest
    @CsvSource({"-1,2,3","1,-1,3","1,2,-1","257,2,3","1,258,3","1,2,259"})
    void testConstructorColorThrows(int color1, int color2, int color3) {
        double sides1 = -5;
        double sides2 = 15;
        double sides3 = 20;
        assertThrows(IllegalArgumentException.class, () ->
        {
            Color color = new RGB(color1,color2,color3);
            triangle = new ru.nshi.learn.work6.Triangle(sides1,sides2,sides3,color);
            triangle.setColor(color);
        }
        );
    }
    @ParameterizedTest
    @CsvSource({"3,4,5,6", "1,2,3,0"})
    void testGetArea(int sides1,int sides2,int sides3, int expectedArea) {
        Color color = new RGB(1,1,1);
        triangle = new Triangle(sides1,sides2,sides3,color);
        assertEquals(triangle.getArea() , expectedArea);
    }
}
