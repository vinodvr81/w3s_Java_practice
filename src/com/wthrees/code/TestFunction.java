package com.wthrees.code;
import java.util.Scanner;

public class TestFunction {

    public static Integer square(Integer x) {
        Integer y = x * x;
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number ...");
       
        Integer n = sc.nextInt();
        Integer result = TestFunction.square(n);
        System.out.println("Square of " + n + " is " + result);
        
        sc.close(); // Good practice to close Scanner
    }
}
