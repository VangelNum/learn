package ru.nshi.learn.work6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    Rectangle rectangle;

    @Test
    void testConstructor(){
        double sides1 = -5;
        double sides2 = 10;
        assertThrows(IllegalArgumentException.class, () ->
        {
            Color color = new RGB(-1,-2,-3);
            rectangle = new ru.nshi.learn.work6.Rectangle(sides1,sides2,color);
        });
    }


    @ParameterizedTest
    @CsvSource({"-1,2,3","1,-1,3","1,2,-1","257,2,3","1,258,3","1,2,259"})
    void testConstructorColorThrows(int color1, int color2, int color3) {
        double length = -5;
        double width = 10;
        assertThrows(IllegalArgumentException.class, () -> {
            Color color = new RGB(color1,color2,color3);
            rectangle = new ru.nshi.learn.work6.Rectangle(length,width,color);
            rectangle.setColor(color);
        });
    }
    @ParameterizedTest
    @CsvSource({"2,5,10", "3,5,15"})
    void testGetArea(double length,double width, double expectedArea) {
        Color color = new RGB(1,1,1);
        rectangle = new Rectangle(length,width,color);
        System.out.println("length="+length + "    width= "+  width);
        System.out.println("Area=  "+ rectangle.getArea());
        assertEquals(rectangle.getArea(),expectedArea);
    }
}
