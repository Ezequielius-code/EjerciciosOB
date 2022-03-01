package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(45);
        person.setName("Alberto");
        person.setPhoneNumber("+549-11-7895-6482");

        System.out.println("Name: " + person.getName() + "\nAge: " + person.getAge() +
                          "\nPhone number: " + person.getPhoneNumber());
    }
}
 class Person {
    private int age;
    private String name;
    private String phoneNumber;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
 }