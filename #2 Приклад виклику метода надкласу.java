package com.company;

public class Vehicle {
    int passengers; //Кількість пасажирів
    int wheels; // Число коліс
    int maxspeed; // Максимальна швидкість
    int burnup; // Розхіж палива

    // Конструктор класа Vehicle
    Vehicle(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }  // Vehicle() constructor

    //Розрахунок пройденого шляху
    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    } // distance(double) method

    //метод читання значення maxspeed
    int getMaxspeed() {
        return this.maxspeed;
    }

    //метод читання значення кількості колес
    int getWheels() {
        return this.wheels;
    }

    // новий метод
    public String toString() {
        return "Vehicle(passengers= " + passengers + "; " + "wheels= " + wheels + "; " + "maxspeed= " + maxspeed + "; " + "burnup= " + burnup +")";

    } // toString() method
} // class Vehicle

class Auto extends Vehicle {
    boolean sunroof; // наявність люка

    Auto(boolean sunroof) {
        this(4, 4, 200, 12, sunroof);
    } // Auto(boolean) constructor

    //конструктор підкласу Auto з 5 параметрами
    Auto(int f, int g, int h, int j, boolean sunroof) {
        super(f, g, h, j);
        this.sunroof = sunroof;
    } //Auto(int f, int g, int h, int j, boolean sunroof) constructor

} //class Auto

class VechicleOverriDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(2, 2, 100, 9);
        Auto a = new Auto(2, 4, 180, 12, true);
        System.out.println("Vehicle.toString(): " + v.toString());
        System.out.println("Auto.toString(): " + a.toString());

    } // main(String[]) method
} // VehicleOverrideDemo class
