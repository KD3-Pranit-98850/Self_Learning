package com.sunbeam;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

class Lion extends Animal {         
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars");
    }
}

class Elephant extends Animal {      
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets");
    }
}

class Monkey extends Animal {        
    public Monkey(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey chatters");
    }
}

class Zoo {
    private String zooName;
    private Animal[] animals;

    public Zoo(String zooName) {
        this.zooName = zooName;

        animals = new Animal[3];

        animals[0] = new Lion("Sheru");
        animals[1] = new Elephant("Raju");
        animals[2] = new Monkey("Motu");
    }

    public void displayAnimals() {
        System.out.println("Zoo Name: " + zooName);

        for (Animal animal : animals) {
            animal.eat();
            animal.makeSound();
            System.out.println();
        }
    }
}

public class Q3 {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("City Zoo");

        zoo.displayAnimals();
    }
}