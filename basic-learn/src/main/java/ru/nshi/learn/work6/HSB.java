package ru.nshi.learn.work6;

public class HSB extends Colour {
    int hue;
    int saturation;
    int brightness;

    HSB(int hue,int saturation,int brightness){
        this.hue=hue;
        this.saturation=saturation;
        this.brightness=brightness;
    }

    @Override
    public String toString()
    {
        return "оттенок = "+hue +"\n"+ "насыщенность = "+saturation +"\n"+ "яркость = "+brightness;
    }

    @Override
    public boolean isColor(){
        if (hue>360 || hue<0 || saturation>100 || saturation<0 || brightness>100 || brightness<0) return false;
        else return true;
    }

}