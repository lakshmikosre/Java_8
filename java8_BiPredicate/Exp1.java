package java8_BiPredicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Exp1 {

	public static void main(String[] args) {
		   
		Predicate<Integer> isEven = x -> x% 2 == 0;
		System.out.println(isEven.test(33));
		
		// Bi-Predicate 
		
		BiPredicate<Integer , Integer> predicate1 = (x , y)  -> x % 2 ==  0  &&  y % 2 == 0;
		BiPredicate<Integer , Integer> predicate2 = (x , y)  -> x % 2 ==  0  &&  y % 2 == 0;
		System.out.println(predicate1.test(2, 4));
		System.out.println(predicate2.test(6, 9));
		
		
		BiPredicate<Integer , Integer> predicate4 = (x , y)  -> x % 2 ==  0  ||  y % 2 == 0;
		System.out.println(predicate4.test(2, 7));
        
	}

}
