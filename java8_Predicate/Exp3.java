package java8_Predicate;


import java.util.function.Predicate;

public class Exp3 {

	public static void main(String[] args) {
		Predicate <Integer>  vote = age  -> (age >18);
		
		System.out.println(vote.test(54));
		
	}

}
