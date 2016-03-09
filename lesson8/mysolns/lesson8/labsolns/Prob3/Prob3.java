package lesson8.labsolns.Prob3;

import java.util.List;
import java.util.ArrayList;
import java.util.function.BiFunction;

public class Prob3 {
	public static void main(String[] args){
		BiFunction<Double, Double, List<Double>> 
		 biFunc = (x, y) -> {
			 List<Double> list = new ArrayList();
			 list.add(Math.pow(x,  y));
			 list.add(x*y);
			 return list;
		 };
		 
		 System.out.println("The result is: " + biFunc.apply(2.0, 3.0));
	}
}
