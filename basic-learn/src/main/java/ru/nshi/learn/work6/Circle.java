package ru.nshi.learn.work6;

public class Circle extends GeometricFigure {
    private double diagonal ;

    public Circle(double diagonal,Colour colour)
    {
        
        super(colour);
        if (diagonal<=0) throw new IllegalArgumentException("Неверное значение");
        this.diagonal=diagonal;
    }

    public double getArea(){
            double r = this.diagonal / 2;
            return (Math.pow(r, 2) * 3.14);
    }

    public double getDiagonal(){
        return this.diagonal;
    }

    public String toString()
    {
        return "Диагональ = "+this.getDiagonal() +"\n"+"Площадь = "+this.getArea() +"\n";
    }
}
