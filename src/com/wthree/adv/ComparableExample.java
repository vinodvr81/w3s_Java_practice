package com.wthree.adv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Define a Car class which is comparable
class CarT implements Comparable {
  public String brand;
  public String model;
  public int year;
  
  public CarT(String b, String m, int y) {
    brand = b;
    model = m;
    year = y;
  }
  
  // Decide how this object compares to other objects
  public int compareTo(Object obj) {
	  CarT other = (CarT)obj;
    if(year < other.year) return -1; // This object is smaller than the other one
    if(year > other.year) return 1;  // This object is larger than the other one
    return 0; // Both objects are the same
  }
}

public class ComparableExample { 
  public static void main(String[] args) { 
    // Create a list of cars
    ArrayList<CarT> myCars = new ArrayList<CarT>();    
    myCars.add(new CarT("BMW", "X5", 1999));
    myCars.add(new CarT("Honda", "Accord", 2006));
    myCars.add(new CarT("Ford", "Mustang", 1970));

    // Sort the cars
    Collections.sort(myCars);

    // Display the cars
    for (CarT c : myCars) {
      System.out.println(c.brand + " " + c.model + " " + c.year);
    }
  } 
}