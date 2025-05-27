package com.wthree.code;
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class RunTimePolyExample {
    public static void main(String[] args) {
        Animal myAnimal;
        myAnimal = new Animal();
        myAnimal.sound();  // Output: Dog barks

        myAnimal = new Dog();
        myAnimal.sound();  // Output: Dog barks

        myAnimal = new Cat();
        myAnimal.sound();  // Output: Cat meows
    }
}
