package com.wthree.oops;


abstract class AnimalAn {

  public abstract void animalSound();
  public void sleep() {
    System.out.println("Sssshhhh");
  }
}


class Wolverine extends AnimalAn {
  public void animalSound() {
    System.out.println("The Wolverine says: grrr grr");
  }
}

class AbstractExample {
  public static void main(String[] args) {
	Wolverine myWol = new Wolverine();
	myWol.animalSound();
	myWol.sleep();
  }
}