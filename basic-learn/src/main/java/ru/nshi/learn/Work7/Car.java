package ru.nshi.learn.Work7;

public class Car {
    private String carModel;
    private String carMaker;
    private int    carModelYear;
    private String color;

    Car() {}
    Car(String carMaker) {
        this.carMaker = carMaker;
    }


    @Override
    public String toString() {
        return  "\nCar{" + "carModel=" + carModel + ", \t\t\t\tcarMake='" + carMaker + '\'' + ", " +
                "\t\t\t\tcarModelYear='" + carModelYear + '\'' + ", \t\t\t\tcolor='" + color + '\'' + '}';
    }

    public String getCarModel()                       { return carModel; }
    public String getCarMaker()                       { return carMaker; }
    public int    getCarModelYear()                   { return carModelYear; }
    public String getColor()                          { return color; }

    public void setCarModel(String carModel)          { this.carModel = carModel; }
    public void setCarMaker(String carMaker)          { this.carMaker = carMaker; }
    public void setCarModelYear(int carModelYear)     { this.carModelYear = carModelYear; }
    public void setColor(String color)                { this.color = color; }

}