package lesson10.labsolns.Prob2;

import java.util.Arrays;
import java.util.List;
public class Prob2 {
	public static void main(String[] args){
		List<Integer> list1 = Arrays.asList(1, 2, 10, 9, 8, -1);
		System.out.println(secondSmallest(list1));
		List<Double> list2 = Arrays.asList(1.0, 2.0, 10.0, 9.0, 8.0, -1.0);
		System.out.println(secondSmallest(list2));
	}
	
	public static <T extends Comparable> T secondSmallest(List<T> list){
		Pair<T> result = findMinAnd2ndSmallest(list, 0, list.size() - 1);
		if(result != null) return result.second;
		return null;
	}
	
	private static <T extends Comparable> Pair<T> findMinAnd2ndSmallest(
			List<T> a, int start, int end){  
		if(start > end) return null;
	    if(start == end) return new Pair(a.get(start), null);  
	    Pair<T> left = findMinAnd2ndSmallest(a, start, (start+end) / 2);  
	    Pair<T> right = findMinAnd2ndSmallest(a,(start+end) / 2+1, end);  
	    T smallest = null, secondSmallest = null;  
	    if(left.first.compareTo(right.first) < 0) {   
	        smallest = left.first; secondSmallest = right.first;  
	        
	        if(left.second != null && right.first.compareTo(left.second) >= 0) 
	        	secondSmallest = left.second;  
	    }else {  
	        smallest = right.first; secondSmallest = left.first; 
	        if(right.second != null && left.first.compareTo(right.second) >= 0) 
	        	secondSmallest = right.second;  
	    }  
	    return new Pair(smallest, secondSmallest);  
	}  
	
	private static class Pair<T> {
		T first;
		T second;
		public Pair(T f, T s){
			first = f; second = s;
		}
	}
}
