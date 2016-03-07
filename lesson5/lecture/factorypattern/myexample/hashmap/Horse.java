package lesson5.lecture.factorypattern.myexample.hashmap;

public class Horse extends AbstractAnimal  implements Animal {

	@Override
	public void speak() {
		System.out.println("Neigh!");
	}

}