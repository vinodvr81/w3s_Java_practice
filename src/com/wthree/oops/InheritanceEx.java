
package com.wthree.oops;
class Animal {
  protected String AnType = "Tiger";    
  public String AnimalName = "Siberian Tiger";   
  public void roar() {                    
    System.out.println("Roar, roar!");
  }
}

class InheritanceEx extends Animal {
  
  public static void main(String[] args) {

	  Animal myAnimal = new Animal();

	  myAnimal.roar();
    System.out.println(myAnimal.AnType + " " + myAnimal.AnimalName);
  }
public String getAnimalName() {
	return AnimalName;
}
public void setAnimalName(String animalName) {
	AnimalName = animalName;
}
}