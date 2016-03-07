package lesson3.lecture.stacklinkedlist;

import java.util.ArrayList;

@SuppressWarnings("serial")
class Stack<T> extends ArrayList<T> {
	private int stackPointer = 0;

	public void push(T article) {
		int insertPosition = stackPointer;
		add(insertPosition, article);// add method is from the ArrayList class
		stackPointer++;
	}

	public T pop() {
		return remove(--stackPointer);
	}

	
	public static void main(String[] args) {
		//ArrayList<String> l = new ArrayList<>();
		//l.add(2, "a");
		Stack<String> stack = new Stack<>();
		stack.push("1");
		stack.push("2");
		System.out.println(stack);
		//Uses base class method clear()
		stack.clear(); // Stack gets empty, but stack pointer is in the position of 2(index).
		System.out.println(stack);
		//Pushing a new element produces a strange result
		try {
			//Code will try to place "1" in position 2 of base array, in empty to array we can not specify the position
			stack.push("1");
		} catch(Exception e) {
			System.out.println("Caught exception of type: " + e.getClass().getName());
			System.out.println("..error message: " + e.getMessage());
		}
		
		
	}

}
