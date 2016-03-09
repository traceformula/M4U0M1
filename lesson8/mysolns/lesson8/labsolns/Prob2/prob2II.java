package lesson8.labsolns.Prob2;


import java.util.function.Supplier;
public class prob2II {
	public static void main(String[] args){
		Supplier<Double> supplier = ()-> Math.random();
		System.out.println("Problem 2 ii:");
		System.out.println("A Random number is: " + supplier.get());
	}
}
