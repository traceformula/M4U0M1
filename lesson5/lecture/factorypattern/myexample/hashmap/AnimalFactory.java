package lesson5.lecture.factorypattern.myexample.hashmap;


import java.util.HashMap;


/*public class AnimalFactory {
	
	public static final int CAT = 0;
	public static final int DOG = 1;
	
	public static Animal createAnimal(int type)  {
		
		switch(type) {
		case CAT:
			return new Cat();
		case DOG: 
			return new Dog();
		}
		
		return null;
	}
}*/


 final public class AnimalFactory {
private AnimalFactory(){}
static HashMap<String, Animal> map = new HashMap<>();
static {
	map.put("Dog", new Dog());
	map.put("Cat", new Cat());
	map.put("Horse", new Horse());
}
public static Animal getAnimal(String c) {
	Animal cl = map.get(c);
	if(cl!=null)
		return cl;
	else return null;
	
}
}
