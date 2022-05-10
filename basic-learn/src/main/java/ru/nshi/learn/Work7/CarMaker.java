package ru.nshi.learn.Work7;

public class CarMaker {
    String maker;
    Car cars;

    public CarMaker(String maker, Car cars) {
        this.cars = cars;
        this.maker = maker;
    }

    public void setCars(Car cars){ this.cars = cars; }
    public void setMaker(String maker) { this.maker = maker; }
    public String getMaker() { return maker; }
    public Car getCars() { return cars;}
    public String getModel() { return cars.getCarModel(); }
    @Override
    public String toString() {
        return "\nCarMaker{" +
                "maker='" + maker + '\'' +
                ",cars={model=\"" + cars.getCarModel() + '\"' +
                ", maker=\"" + maker + "\"" +
                ", year=" + cars.getCarModelYear() +
                ", color=\"" + cars.getColor() + "\"}}";
    }
}