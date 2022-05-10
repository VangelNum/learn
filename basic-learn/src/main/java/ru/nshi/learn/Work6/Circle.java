package ru.nshi.learn.work6;

public class Circle extends Figure {
    public double diagonal ;

    public Circle(double diagonal,Color color)
    {
        super(color);
        if (diagonal<=0) throw new IllegalArgumentException("negative values");
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
        return "diagonal = "+this.getDiagonal() +"\n"+"Area = "+this.getArea() +"\n";
    }
}
