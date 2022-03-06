package com.exercise;

public class Main {

    public static void main(String[] args) {
        SmartPhone firstSmartPhone = new SmartPhone("Samsung", "S22 Ultra", 6.8, "1 TB", 12, true, 1301.9, "108 MP");
        SmartPhone secondSmartPhone = new SmartPhone("Realme", "GT2 Pro", 6.7, "512 GB", 12, true, 549.0, "50 MP");

        SmartWatch firstSmartWatch = new SmartWatch("LG", "Watch Urbane", 1.3, "512 GB", 4, false, 364.8, "Compass, Cardiac Frequency");
        SmartWatch secondSmartWatch = new SmartWatch("Asus", "Zenwatch 2", 1.45, "512 GB", 4, false, 95.0, "Pedometer");

        System.out.println(firstSmartPhone);
        System.out.println(secondSmartPhone);
        System.out.println(firstSmartWatch);
        System.out.println(secondSmartWatch);
    }
}
