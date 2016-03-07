package lesson3.lecture.stacklinkedlist;
import java.util.Vector;
import java.util.Stack;
public class Main {

	public static void main(String[] args) {
		// Here using API Stack
		Stack<String> s = new Stack<>();
		s.push("1");
		s.push("2");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.clear();
		s.push("1");
		System.out.println(s);
	}

}
