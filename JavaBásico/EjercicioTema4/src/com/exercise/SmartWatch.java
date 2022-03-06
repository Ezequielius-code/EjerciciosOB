package com.exercise;

public class SmartWatch extends SmartDevice{
    String sensors;

    public SmartWatch() {
    }

    public SmartWatch(String manufacturer, String model, double screenInches, String internalMemory, int ramMemory,
                      boolean isExpansible, double price, String sensors) {
        super(manufacturer, model, screenInches, internalMemory, ramMemory, isExpansible, price);
        this.sensors = sensors;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", screenInches=" + screenInches +
                ", internalMemory=" + internalMemory +
                ", ramMemory=" + ramMemory +
                ", isExpansible=" + isExpansible +
                ", price=" + price +
                ", sensors='" + sensors + '\'' +
                '}';
    }
}
