
package com.wthree.oops;
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
  
  public static void main(String[] args) {
	    Person myObj = new Person();
	    myObj.name = "Vinod Vukkalam";  
	    System.out.println(myObj.name); 
	    myObj.setName("Nevaan Skanda");
	    System.out.println(myObj.name); 
	  }
}