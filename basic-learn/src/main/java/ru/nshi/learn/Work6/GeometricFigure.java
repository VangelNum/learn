package ru.nshi.learn.work6;

public class  GeometricFigure {
    public Color color;

    public GeometricFigure(Color color){
        this.color=color;
    }

    public Color getColor() {
        return color;
    }
    void setColor(Color color){
        boolean flag = color.isColor();
        if (!flag) throw new IllegalArgumentException("wrong color value");
        this.color=color;
    }
}
