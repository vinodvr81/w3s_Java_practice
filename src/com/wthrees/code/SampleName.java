package com.wthrees.code;
public class SampleName {
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public static void main(String[] args) {
    	SampleName f = new SampleName();
        System.out.println(f.getName());  // You must pass an int value
        f.setName("Vinod Vukkalam");
        System.out.println(f.getName());  
        System.out.println(f.getAge());  // You must pass an int value
        f.setAge(45);
        System.out.println(f.getAge());
    }
	
}

