package lesson3.lecture.inheritancetocomposition;

import java.util.ArrayList;
import java.util.List;

class Person
{
	String fname, lname;
	List <PersonRole> roles = new ArrayList();
	public Person(String fname, String lname, List<PersonRole> roles) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "[fname=" + fname + ", lname=" + lname + ", roles="
				+ roles + "]";
	}
	
	public void duties(){
	 for(PersonRole ob : roles)
	 {
		 ob.responsibility();
	 }
	}
	
}
abstract class PersonRole{
	String role;
	PersonRole(String role){
		this.role=role;
	}
abstract void responsibility();
@Override
public String toString() {
	return "[role=" + role + "]" ;
}	
}

class Staff extends PersonRole
{

	Staff()
	{
		super("Staff");
	}
	@Override
	void responsibility() {
		System.out.println("I am a Staff doing adminstration");
		
	}
	
}

class Faculty extends PersonRole
{
	Faculty() {
		super("Faculty");
		// TODO Auto-generated constructor stub
	}

	@Override
	void responsibility() {
		System.out.println("I am a Faculty teaching FPP & MPP");
		
	}
	
}
class Student extends PersonRole
{

	Student() {
		super("Student");
		// TODO Auto-generated constructor stub
	}

	@Override
	void responsibility() {
		System.out.println("I am a Student doing MS at MUM");
		
	}
	
}



public class InheritanceToComposition {

	public static void main(String args[])
	{
		Staff ob1 = new Staff();
		Student ob2 = new Student();
		List<PersonRole> role = new ArrayList();
		role.add(ob1);
		role.add(ob2);
		Person ob = new Person("Renuka", "Mohanraj", role);
		System.out.println(ob);
		ob.duties();
			
	}
}
