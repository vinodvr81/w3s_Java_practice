package com.wthree.code;
import java.lang.reflect.Method;

public class InspectClass {
    public static void main(String[] args) {
        Class<?> clazz = String.class; // replace with any class

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
  }
}