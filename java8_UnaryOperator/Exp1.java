package java8_UnaryOperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Exp1 {

	public static void main(String[] args) {
		
		// Unary Operator is a special case of function , where we have to declare input return type only at one time 
       // If we know input and output are in same type i.e <Integer , Integer> or <String , String> then using UnaryOperator
		// we can declare the return type only one time .
		
		Function<String,Integer>function = x ->x.length();
		System.out.println(function.apply("Lakshmi"));
		
		Function<Integer , Integer>function1 = x -> x*x;
		System.out.println(function1.apply(5));
		
		Function<String , String>function2 = str  -> str.toLowerCase();
		System.out.println(function2.apply("LAKSHMI"));
		
		System.out.println("    ");
		
		System.out.println("Using UnaryOperator" + "\n" + "-----------------------------------------------");
		
		UnaryOperator<Integer>unaryOperator = x -> x*x*x;
		System.out.println(unaryOperator.apply(7));
		
		UnaryOperator<String>unaryOperator1 = str -> str.toUpperCase();
		System.out.println(unaryOperator1.apply("Lakshmi"));
		
	}

}
