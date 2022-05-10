package ru.nshi.learn.work6;

public class Rectangle extends GeometricFigure {
    public double length;
    public double width;

    public Rectangle(double length,double width,Colour color)
    {
        super(color);
        if (length<=0 || width<=0) throw new IllegalArgumentException("Неверное значение");
        this.length=length;
        this.width=width;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }
    public String toString()  {
        return "Длина = "+this.getLength() +"\n"+ "Ширина = "+this.getWidth()+"\n"+ "Площадь = "+this.getArea()+"\n";
    }
}
