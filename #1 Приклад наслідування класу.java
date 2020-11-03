package com.company;

public class Vehicle {
    int passengers; //Кількість пасажирів
    int wheels; // Число коліс
    int maxspeed; // Максимальна швидкість
    int burnup; // Розхіж палива

    // Конструктор класа Vehicle
    Vehicle() {
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
} // Vehicle class

// підклас (потомок) Auto базового класу Vehicle

class Auto extends Vehicle {
    boolean sunroof; // наявність люка

} //Auto class
class ExtendsVechicleDemo {
    public static void main(String[] args) {

        //створення об'єкта підкласа Auto
        Auto bmw = new Auto();
        bmw.sunroof = true; // люк є внаявності

        //Приклад звернення до методів і змінних
            //надкласа і підкласа
        System.out.println("Шлях, пройдений за 1.5 години: " + bmw.distance(1.5) + " km. ");
        System.out.println("Max.speed: " + bmw.getMaxspeed() + " km/h. ");
        System.out.println("Наявність люка: " + bmw.sunroof);
    }
}

