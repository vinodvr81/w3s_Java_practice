
package com.wthree.adv;
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class SortListEx {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    Collections.sort(cars); // Sort cars

    for (String i : cars) {
      System.out.println(i);
    }
    
    System.out.println("#####################################33");

    Collections.sort(cars, Collections.reverseOrder()); // Sort cars

    for (String i : cars) {
      System.out.println(i);
    }
  }
}