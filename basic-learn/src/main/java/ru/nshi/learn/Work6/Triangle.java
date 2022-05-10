package ru.nshi.learn.work6;

public class Triangle  extends GeometricFigure {

    private double sides1;
    private double sides2;
    private double sides3;

    public Triangle (double sides1,double sides2,double sides3,Colour colour)  {
        super(colour);
        if (sides1 <= 0 || sides2 <= 0 || sides3 <= 0) 
        throw new IllegalArgumentException("Неверные значения");
        this.sides1 = sides1;
        this.sides2 = sides2;
        this.sides3 = sides3;

        if (this.sides1 + this.sides2 < this.sides3
         || this.sides2 + this.sides3 < this.sides1
         || this.sides3 + this.sides1 < this.sides2)
        {
            throw new IllegalArgumentException("Неверные значения");
        }
    }

    public double getArea(){
        double p;
        p = (this.sides1 + this.sides2 + this.sides3) / 2;
        return Math.sqrt(p * (p - this.sides1) * (p - this.sides2) * (p - this.sides3));
    }

    public double getSides1() {
        return this.sides1;
    }
    public double getSides2() {
        return this.sides2;
    }
    public double getSides3() {
        return this.sides3;
    }
    public String toString()  {
        return "Сторона 1 = "+this.getSides1() +"\n"+ "Сторона 2 = "+this.getSides2() +"\n"+"Сторона 3 = "+this.getSides3() +"\n"+"Площадь = "+this.getArea() +"\n";
    }
}

