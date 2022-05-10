package ru.nshi.learn.work6;

public class  GeometricFigure {
    public Colour colour;

    public GeometricFigure(Colour colour){
        this.colour=colour;
    }

    public Colour getColor() {
        return colour;
    }
    void setColor(Colour colour){
        boolean flag = colour.isColor();
        if (!flag) throw new IllegalArgumentException("Неверное значение цвета");
        this.colour=colour;
    }
}
