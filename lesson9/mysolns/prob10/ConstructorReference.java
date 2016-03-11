package prob10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	
    // Query 1  : Print only male canditates
	Stream<Human> stream = Stream.of(list);
	stream.filter((h)->h.getGender().equals("Male"))
		.forEach((x)->{System.out.println(x);});
	
    // Query 2 : Cretae an objecy by choosing suitable Interface to the specified constructors(Totally 3 constuctors) and print the object status
    Function<String, Human> f = Human::new;
    System.out.println(f.apply("Renuka"));	    
    
    Collection<Human> col1 = arrayToCollection(ArrayList<Human>::new, list);
    System.out.println(col1);
   }

// Query 3 : Implement the body

public static Collection<Human> arrayToCollection( Supplier <ArrayList<Human>> fac, Human[] list) // Identify the suitable type of Parameter {
{
	return Stream.of(list).collect(Collectors.toCollection(fac));
}

} 
