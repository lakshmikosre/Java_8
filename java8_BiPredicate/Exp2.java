package java8_BiPredicate;

import java.util.function.BiPredicate;

public class Exp2 {

	public static void main(String[] args) {
		  
		BiPredicate<String , Integer> biPredicate = (str , x) -> str.length() == x;
		System.out.println(biPredicate.test("Lakshmi", 7));
		
		// It checks that we provided the value for given string is true or not

	}

}
