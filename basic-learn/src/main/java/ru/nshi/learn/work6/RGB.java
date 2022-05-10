package ru.nshi.learn.work6;

public class RGB extends Colour {
    int red;
    int green;
    int blue;

    RGB(int red,int green,int blue) {
        this.red=red;
        this.green=green;
        this.blue=blue;
    }

    @Override
    public String toString() {
        return "Красный = "+red +"\n"+ "Зеленый = "+green +"\n"+ "Синий = "+blue;
    }

    @Override
    public boolean isColor() {
        if (red>255 || red<0 || green>255 || green<0 || blue>255 || blue<0) return false;
        else return true;
    }

}
