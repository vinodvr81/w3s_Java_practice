package com.wthrees.code;
public class SecondIf {
    private int age = 43;

    public String correct(int age) {
        this.age = age;
        if (this.age > 40) {
            return "You are in middle age";
        } else {
            return "You are young";
        }
    }

    public static void main(String[] args) {
        SecondIf f = new SecondIf();
        System.out.println(f.correct(40));  // You must pass an int value
        SecondIf ff = new SecondIf();
        System.out.println(ff.correct(45));  // You must pass an int value
    }
}


