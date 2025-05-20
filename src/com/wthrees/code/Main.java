
package com.wthrees.code;
public class Main{
	int x = 5;
	
	public static void main(String[] args) {
	  Main myObj = new Main();
	  System.out.println(myObj.x);
	  
	  Main myObj1 = new Main();  // Object 1
	  myObj1.x = 145;
	  Main myObj2 = new Main();  // Object 2
	  myObj2.x = 225;
	  System.out.println(myObj1.x);  // Outputs 145
	  System.out.println(myObj2.x);  // Outputs 225
	}
}