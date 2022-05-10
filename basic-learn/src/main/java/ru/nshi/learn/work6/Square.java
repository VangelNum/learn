package ru.nshi.learn.work6;

public class Square extends GeometricFigure {
    private double sides;

    public Square(double sides, Colour colour){
        super(colour);
        if (sides<=0) throw new IllegalArgumentException("Стороны < 0");
        this.sides=sides;
    }
    public double getArea(){
            return this.sides * this.sides;
    }
    public double getSides(){
        return this.sides;
    }

    public String toString() {   
        return "Стороны = "+this.getSides() +"\n"+ "Площадь = "+this.getArea()+"\n";
    }

}

