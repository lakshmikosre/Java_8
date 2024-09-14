package java_8.Predicate;

import java.util.function.Predicate; // Predicate is used to test condition
public class PredicateExp2 {

	public static void main(String[] args) {
	                
		    Predicate<Integer>isodd=x -> x%2==0;
		    
		    @SuppressWarnings("unused")
		    
            Predicate<String>startWithLetterl=x->x.toLowerCase().charAt(1) == 'l';
            
            Predicate<String>startWithLetterL=x->x.toUpperCase().charAt(0) == 'L';
            
            System.out.println(isodd.test(4));
            System.out.println(startWithLetterL.test("Kl"));
            System.out.println(startWithLetterL.test("L"));
            
	}

}
