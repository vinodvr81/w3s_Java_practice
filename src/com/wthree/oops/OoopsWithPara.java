package com.wthree.oops;

public class OoopsWithPara {
  int modelYear;
  String modelName;

  public OoopsWithPara(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
	  OoopsWithPara myCar = new OoopsWithPara(2025, "Maruthi S-Presso");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}