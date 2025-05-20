package com.wthree.oops;

abstract class Abstractex {
	  public String fname = "Vinod Vukkalam";
	  public int age = 44;
	  public abstract void study(); // abstract method
	}

	// Subclass (inherit from Main)
	class StudentAbEx extends Abstractex {
	  public int graduationYear = 2012;
	  public void study() { // the body of the abstract method is provided here
	    System.out.println("Studying all day long");
	  }
	}

class AbsractClassEx {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
	  StudentAbEx myObj = new StudentAbEx();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}
