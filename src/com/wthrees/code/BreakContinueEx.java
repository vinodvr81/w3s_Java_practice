package com.wthrees.code;


public class BreakContinueEx {
    public static void main(String[] args) {
    	for (int i = 0; i < 10; i++) {
    		  if (i == 4) {
    		    break;
    		  }
    		  System.out.println(i);
    		}
    	
    	System.out.println("\n");
    	System.out.println("\n");
    	for (int i = 10; i < 20; i++) {
    		  if (i == 14) {
    		    continue;
    		  }
    		  System.out.println(i);
    		}
    	System.out.println("\n");
    	System.out.println("\n");
    	String[] bikes = {"tvs", "honda", "maruthi", "tata"};
    	for(int bik = 0; bik < bikes.length; bik++) {
    		System.out.println(bikes[bik]);
    	}
    	System.out.println("\n");
    	System.out.println("\n");
    	for(String bik : bikes) {
    		System.out.println(bik);
    	}
    }
}