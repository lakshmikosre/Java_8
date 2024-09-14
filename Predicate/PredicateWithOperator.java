package java_8.Predicate;

import java.util.function.Predicate;

public class PredicateWithOperator {

	public static void main(String[] args) {
		        
		Predicate<String>startWithLetterL = x -> x.toUpperCase().charAt(0) == 'L';
		Predicate<String>endsWithLetterI = x -> x.toUpperCase().charAt(4) == 'I';
		
//		Predicate<String>endsWithLetterU = x -> x.toUpperCase().charAt(x.length()-1) == 'I';
        
		Predicate<String>and = startWithLetterL .or(endsWithLetterI);
		
		System.out.println(and.test("LAXMI"));
	}
           
}
