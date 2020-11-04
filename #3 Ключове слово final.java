package com.company;

public class MathConst {

    public static  final double PI = 3.14159;
    public static  final double E = 2.71828;
} // MathConst class

class A {
    final void metoda() {
        System.out.println(" Кінцевий метод");
        } // metoda() method
        } //class A

class B extends A {
    void metoda() { // ПОМИЛКА, метод надкласа кінцевий
        System.out.println("Неможливо!");
    }
}
