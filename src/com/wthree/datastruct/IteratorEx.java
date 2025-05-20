
package com.wthree.datastruct;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Maruth");
    cars.add("Tata");
    cars.add("Hyundai");
    cars.add("Mahindra");
    cars.add("Kia");

    Iterator<String> itc = cars.iterator();

    while(itc.hasNext()) {
      System.out.println(itc.next());
    }
    cars.add(1, "Mazda");
    
    Iterator<String> it = cars.iterator();

    System.out.println("####################################################");
    
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}