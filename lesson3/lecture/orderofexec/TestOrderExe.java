package lesson3.lecture.orderofexec;
class Parent{
	static final double s1 = 10.0;
	String s;
	static
	{
		System.out.println("1. Parent Static Block s1 = " + s1);
	}
	
	{
		System.out.println("3. Parent Instant Initialization Block ");
	}
	Parent(){
		System.out.println("4. Parent Default Constructor ");
		
	}
	
	Parent(String x){
		s = x;
		System.out.println("Parent Instance Variable s " + s);
	}
}

class Child extends Parent{
	static final double s2 = 20.0;
	String y;
	static
	{
		System.out.println("2. Child Static Block s1 = " + s2);
	}
	
	{
		System.out.println("5. Child Instant Initialization Block ");
	}
	Child(){
	//	super("Hello");
		System.out.println("6. Child Default Constructor ");
		
	}
	
	Child(String x){
		y = x;
		System.out.println("Child Instance Variable s " + y);
	}
}

public class TestOrderExe {

	public static void main(String[] args) {
		//Parent p = new Parent();
		Child c = new Child();

	}

}
