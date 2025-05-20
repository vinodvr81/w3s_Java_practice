package com.wthree.datastruct;
import java.util.Iterator;

public class WrapperExample {
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    String sts = "Hello Vinod Vukkalam!";
    System.out.println(myInt.intValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());
    System.out.println(sts.chars());
    System.out.println(sts.charAt(1));
    System.out.println(sts.toString());
    System.out.println(sts.length());
  }
}