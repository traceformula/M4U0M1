package lesson5.lecture.factorypattern.myexample.hashmap;

import java.util.HashMap;

/*
 * Factory pattern
 * Want to create objects implementing some interface
 * or having same parent
 * Creating an object is complex
 * e.g. lots of constructor parameters
 * Possible to simplify choice of objects
 */


public class App {
	public static void main(String[] args) {
	
	/*	Animal animal = AnimalFactory.createAnimal(0);
		animal.speak();*/
		Animal animal = AnimalFactory.getAnimal("Horse");
		if(animal!=null)
		{
		animal.speak();
		animal.eat();
		}
		else
			System.out.println("No object found for this type");

	}

}
