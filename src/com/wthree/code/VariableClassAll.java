package com.wthree.code;
public class VariableClassAll{
    public static void main(String[] args) {
    	String St = "Hello Vinod Vukkalam";
    	int it = 123;
    	double ft = 4624.545;
    	String cg = "d";
    	boolean bn = true;

    	System.out.println(St + it + ft + cg + bn);
    	
    	// manual casting
    	
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
        // String concatenation
        
        String firstName = "Vinod";
        String lastName = "Vukkalam";
        System.out.println(firstName + " " + lastName);
        
        String nfirstName = "Nevaan ";
        String nlastName = "Skanda";
        System.out.println(nfirstName.concat(nlastName));
        
    }
}
