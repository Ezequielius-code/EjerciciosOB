package com.exercise;

public class SmartDevice {
    protected String manufacturer;
    protected String model;
    protected double screenInches;
    protected String internalMemory;
    protected int ramMemory;
    protected boolean isExpansible;
    protected double price;

    public SmartDevice() {}

    public SmartDevice(String manufacturer, String model, double screenInches, String internalMemory, int ramMemory, boolean isExpansible, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.screenInches = screenInches;
        this.internalMemory = internalMemory;
        this.ramMemory = ramMemory;
        this.isExpansible = isExpansible;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", screenInches=" + screenInches +
                ", internalMemory=" + internalMemory +
                ", ramMemory=" + ramMemory +
                ", isExpansible=" + isExpansible +
                ", price=" + price +
                '}';
    }
}
