package lesson8.labsolns.Prob2;


import java.util.function.Supplier;
public class Prob2III {
	public static void main(String[] args){
		Prob2III p = new Prob2III();
		p.print();
	}
	
	public void print(){
		Supplier<Double> supplier = new RandomSupplier();
		System.out.println("Problem 2 iii:");
		System.out.println("A Random number is: " + supplier.get());
	}
	
	public class RandomSupplier implements Supplier<Double>{
		@Override
		public Double get(){
			return Math.random();
		}
	}
}
