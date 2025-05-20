package com.wthree.adv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Define a Car class
class CarN {
  public String brand;
  public String model;
  public int year;
  
  public CarN(String b, String m, int y) {
    brand = b;
    model = m;
    year = y;
  }
}

// Create a comparator
class SortByYear implements Comparator {
  public int compare(Object obj1, Object obj2) {
    // Make sure that the objects are Car objects
	  CarN a = (CarN) obj1;
	  CarN b = (CarN) obj2;
    
    // Compare the year of both objects
    if (a.year < b.year) return -1; // The first car has a smaller year
    if (a.year > b.year) return 1;  // The first car has a larger year
    return 0; // Both cars have the same year
  }
}

public class ComparatorEx { 
  public static void main(String[] args) { 
    // Create a list of cars
    ArrayList<CarN> myCars = new ArrayList<CarN>();    
    myCars.add(new CarN("BMW", "X5", 1999));
    myCars.add(new CarN("Honda", "Accord", 2006));
    myCars.add(new CarN("Ford", "Mustang", 1970));

    // Use a comparator to sort the cars
    Comparator myComparator = new SortByYear();
    Collections.sort(myCars, myComparator);

    // Display the cars
    for (CarN c : myCars) {
      System.out.println(c.brand + " " + c.model + " " + c.year);
    }
  } 
}