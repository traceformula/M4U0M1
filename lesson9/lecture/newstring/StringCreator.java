package lesson9.lecture.newstring;
import java.util.function.*;
public class StringCreator {
	public static void main(String[] args) {
      Function<char[], String> myFunc = String::new; // take char[] aray as input and return the string
	 
      
      char[] charArray = 
              {'s','p','e','a','k','i','n','g','c','s'};
      String s = new String(charArray);
      System.out.println(s);
	  System.out.println(myFunc.apply(charArray));
	  //Function<char[], String> myFunc1 = charArr -> new String(charArray);
    }

}
