package java8_Predicate;

import java.util.function.Predicate;

public class Equality {

	public static void main(String[] args) {
	    
		Predicate<Object> predicate = Predicate.isEqual("Lakshmi");
		System.out.println(predicate.test("Lakshmi"));
		
		Predicate<Object> predicate2 = Predicate.isEqual("Lakshmi");
		System.out.println(predicate2.test("Laxmi"));
		
		Predicate<Object> integer = Predicate.isEqual(55);
		System.out.println(integer.test(55));
		
		Predicate<Object> integer2 = Predicate.isEqual(55);
		System.out.println(integer.test(96));

		//It check either value correct with given integer or not
		
	  // Predicate Samapt 🙂💀

		

	}

}
