package java_8.Predicate;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		   
		Predicate<Integer>isEven = number -> number %2==0;
		System.out.println(isEven.test(4));
		System.out.println(isEven.test(9));

	}

}
