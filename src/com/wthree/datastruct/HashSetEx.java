
package com.wthree.datastruct;
import java.util.HashSet;

public class HashSetEx {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Tata");
    cars.add("Kia");
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Mahindra");
    cars.add("BYD");
    System.out.println(cars);
    System.out.println("#########################################");
    for (String i : cars) {
    	  System.out.println(i);
    	}
  }
}