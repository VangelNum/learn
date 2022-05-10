package ru.nshi.learn.work6;

public class Square extends GeometricFigure {
    public  double sides;

    public Square(double sides, Colour color){
        super(color);
        if (sides<=0) throw new IllegalArgumentException("Sides < 0");
        this.sides=sides;
    }
    public double getArea(){
            return this.sides * this.sides;
    }

    public double getSides(){
        return this.sides;
    }

    public String toString()
    {
        return "sides = "+this.getSides() +"\n"+ "Area = "+this.getArea()+"\n";
    }

}

