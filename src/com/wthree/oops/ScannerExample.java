package com.wthree.oops;
import java.util.Scanner;

class ScannerExample {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");


    String name = myObj.nextLine();
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();
    
    boolean bb = myObj.nextBoolean();
    byte by = myObj.nextByte();

    float ff = myObj.nextFloat();

//    long ll = myObj.nextLong();
//    short ss = myObj.nextShort();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
    System.out.println("Boolean: " + bb);
    System.out.println("Byte: " + by);
    System.out.println("float: " + ff);
//    System.out.println("long: " + ll);
//    System.out.println("short: " + ss);
    
  }
}
