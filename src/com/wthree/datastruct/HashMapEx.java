
package com.wthree.datastruct;
import java.util.HashMap;

public class HashMapEx{
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("India", "New Delhi");
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    
    for (String i : capitalCities.keySet()) {
    	  System.out.println(i);
    	}
    System.out.println("##################################################");  
    for (String i : capitalCities.values()) {
    	  System.out.println(i);
    }
    System.out.println("##################################################");  
    for (String i : capitalCities.keySet()) {
    	  System.out.println("key: " + i + " value: " + capitalCities.get(i));
    	}
  }
}