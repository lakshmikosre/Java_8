package java8_Predicate;

import java.util.function.Predicate;

public class PredicateNegate {

	public static void main(String[] args) {
		
         Predicate<String>startWithLetterD = x->x.toUpperCase().charAt(0)=='D';
         
         System.out.println(startWithLetterD.test("Dabbu"));
		
         System.out.println(startWithLetterD.negate().test("Boraemon"));
	}

}
