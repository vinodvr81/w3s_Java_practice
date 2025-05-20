package com.wthree.oops;

class AnimalExSound {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends AnimalExSound {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends AnimalExSound {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class PolyExample {
  public static void main(String[] args) {
	  AnimalExSound myAnimal = new AnimalExSound();  // Create a Animal object
	  AnimalExSound myPig = new Pig();  // Create a Pig object
	  AnimalExSound myDog = new Dog();  // Create a Dog object
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();
  }
}