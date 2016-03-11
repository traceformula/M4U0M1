package lesson11.lecture.generics.slideexplanation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CalculateMin(10,20));
		System.out.println(CalculateMin(10.56,20.78));
	//	System.out.println(CalculateMin("First","Second"));
		System.out.println("Sum of Ints : " + sum(Arrays.asList(1,2,3)));
		System.out.println("Sum of Doubles : " +sum(Arrays.asList(1.5,2.5,3.5)));
		
		print(Arrays.asList(1,2,3));
		print(Arrays.asList(1.5,2.5,3.5));
		List<String> l = new ArrayList();
		l.add("AA");
		l.add("BB");
		print(l);
		

	}

	// To find the Minimum of two Number types and implements Comparable
	// More than one boundaries
	public static <T extends Number & Comparable<T>> T CalculateMin(T t1, T t2){
	 if (t1.compareTo(t2) < 0)
		 return t1;
	 else
		 return t2;
	 
	}
	
	// Wild card with upper bound
	public static double sum(List<? extends Number> list){
		double temp= 0.0;
		for(Number num : list){
			temp = temp + num.doubleValue();
		}
		return temp;
		
	}
	// Wild card without boundaries
	static  void print(List<?> a) {
		System.out.println("\nList of Elements : ");
		 for (Object ae : a) {
		 System.out.print(ae + " ");
		 }
	   }
}
