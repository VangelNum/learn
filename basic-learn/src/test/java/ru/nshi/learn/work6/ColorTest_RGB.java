package ru.nshi.learn.work6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class ColorTest_RGB {
    GeometricFigure figure;

    @Test
    void testConstructor(){
        assertThrows(IllegalArgumentException.class, () ->
        {
            Colour colour = new RGB(-1,-2,-3);
            figure = new ru.nshi.learn.work6.GeometricFigure(colour);
            figure.setColor(colour);
        });
    }

    @ParameterizedTest
    @CsvSource({"-1,2,3","1,-1,3","1,2,-1","257,2,3","1,258,3","1,2,259"})
    void testConstructorColorThrows(int colour1, int colour2, int colour3) {
        assertThrows(IllegalArgumentException.class, () -> {
            Colour colour = new RGB(colour1,colour2,colour3);
            figure = new ru.nshi.learn.work6.GeometricFigure(colour);
            figure.setColor(colour);
        });
    }
}