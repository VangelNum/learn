package ru.nshi.learn.work6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    Rectangle rectangle;

    @Test
    void testConstructor(){
        double sides1 = -1;
        double sides2 = 10;
        assertThrows(IllegalArgumentException.class, () ->
        {
            Colour colour = new RGB(-1,-2,-3);
            rectangle = new Rectangle(sides1,sides2,colour);
        });
    }


    @ParameterizedTest
    @CsvSource({"-1,2,3","-2,3,4","1,2,259"})
    void testConstructorColorThrows(int colour1, int colour2, int colour3) {
        double length = -5;
        double width = 10;
        assertThrows(IllegalArgumentException.class, () -> {
            Colour colour = new RGB(colour1,colour2,colour3);
            rectangle = new Rectangle(length,width,colour);
            rectangle.setColor(colour);
        });
    }
    @ParameterizedTest
    @CsvSource({"2,5,10", "3,5,15"})
    void testArea(double length,double width, double expectedArea) {
        Colour colour = new RGB(1,1,1);
        rectangle = new Rectangle(length,width,colour);
        System.out.println("Длина = "+length + "\n" + "Ширина = "+  width +"\n"+"Площадь = "+ rectangle.getArea());
        assertEquals(rectangle.getArea(),expectedArea);
    }
}