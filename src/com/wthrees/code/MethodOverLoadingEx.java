package com.wthrees.code;


public class MethodOverLoadingEx {

		static int plusMethodInt(int x, int y) {
		  return x + y;
		}
		
		static double plusMethodDouble(double x, double y) {
		  return x + y;
		}
		
		static float plusMethodFloat(float x, float y) {
			  return x + y;
			}
		
		public static void main(String[] args) {
		  int myNum1 = plusMethodInt(8, 5);
		  double myNum2 = plusMethodDouble(4.3, 6.26);
		  float myNum3 = plusMethodFloat(4.3f, 6.26f);
		  System.out.println("int: " + myNum1);
		  System.out.println("double: " + myNum2);
		  System.out.println("float: " + myNum3);
		}
		
}