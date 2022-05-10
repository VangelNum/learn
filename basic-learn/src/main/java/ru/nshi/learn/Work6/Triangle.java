package ru.nshi.learn.work6;

public class Triangle  extends Figure {

    public double sides1;
    public double sides2;
    public double sides3;

    public Triangle (double sides1,double sides2,double sides3,Color color)
    {
        super(color);
        if (sides1 <= 0 || sides2 <= 0 || sides3 <= 0 ) throw new IllegalArgumentException("negative values");
        this.sides1 = sides1;
        this.sides2 = sides2;
        this.sides3 = sides3;

        if (this.sides1 + this.sides2 < this.sides3
         || this.sides2 + this.sides3 < this.sides1
         || this.sides3 + this.sides1 < this.sides2)
        {
            throw new IllegalArgumentException("figure is not a triangle");
        }
    }

    public double getArea(){
        double p;
        p = (this.sides1 + this.sides2 + this.sides3) / 2;
        return Math.sqrt(p * (p - this.sides1) * (p - this.sides2) * (p - this.sides3));
    }

    public double getSides1(){return this.sides1;}
    public double getSides2(){return this.sides2;}
    public double getSides3(){return this.sides3;}

    public String toString()
    {
        return "sides1 = "+this.getSides1() +"\n"+ "sides2 = "+this.getSides2() +"\n"+"sides3 = "+this.getSides3() +"\n"+"Area = "+this.getArea() +"\n";
    }
}

