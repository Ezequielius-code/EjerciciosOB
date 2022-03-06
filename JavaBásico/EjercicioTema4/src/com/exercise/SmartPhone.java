package com.exercise;

public class SmartPhone extends SmartDevice{
    String cameraResolution;

    public SmartPhone() {
    }

    public SmartPhone(String manufacturer, String model, double screenInches, String internalMemory, int ramMemory,
                      boolean isExpansible, double price, String cameraResolution) {
        super(manufacturer, model, screenInches, internalMemory, ramMemory, isExpansible, price);
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", screenInches=" + screenInches +
                ", internalMemory=" + internalMemory +
                ", ramMemory=" + ramMemory +
                ", isExpansible=" + isExpansible +
                ", price=" + price +
                ", cameraResolution='" + cameraResolution + '\'' +
                '}';
    }
}
