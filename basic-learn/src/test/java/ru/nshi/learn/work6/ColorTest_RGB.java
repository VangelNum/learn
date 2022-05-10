package ru.nshi.learn.work6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class ColorTest_RGB {
    Figure figure;

    @Test
    void testConstructor(){
        assertThrows(IllegalArgumentException.class, () ->
        {
            Color color = new RGB(-1,-2,-3);
            figure = new ru.nshi.learn.work6.Figure(color);
            figure.setColor(color);
        });
    }

    @ParameterizedTest
    @CsvSource({"-1,2,3","1,-1,3","1,2,-1","257,2,3","1,258,3","1,2,259"})
    void testConstructorColorThrows(int color1, int color2, int color3) {
        assertThrows(IllegalArgumentException.class, () -> {
            Color color = new RGB(color1,color2,color3);
            figure = new ru.nshi.learn.work6.Figure(color);
            figure.setColor(color);
        });
    }
}