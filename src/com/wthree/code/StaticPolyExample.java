package com.wthree.code;
class Calculator {
    // Method Overloading
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class StaticPolyExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));         // int version
        System.out.println(calc.add(2.5, 3.5));     // double version
        System.out.println(calc.add(1, 2, 3));      // 3-arg version
    }
}
