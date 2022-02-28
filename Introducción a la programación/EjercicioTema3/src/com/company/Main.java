package com.company;

public class Main {

    public static void main(String[] args) {
	    //Primera parte.
        addition( 15, 63, 80);

        //Segunda parte.
        Car myCar = new Car();

        myCar.setDoors();
        System.out.println(myCar.doors);
    }

    //Primera parte.
    public static void addition( int a, int b, int c ) {
        int result;
        result = a + b + c;
        System.out.println(result);
    }
}

//Segunda parte.
class Car {
    public int doors = 0;

    public void setDoors() {
        this.doors++;
    }
}