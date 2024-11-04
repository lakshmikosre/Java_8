package java8_BinaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;


public class Main {

	public static void main(String[] args) {
	     
	      BiFunction<String , String  , String>biFunction = (str1 , str2)  -> str1 + str2 ; // (T , U , R)
	      System.out.println(biFunction.apply("Lakshmi" , "Kosre")); // It Joins two string 
	      
	      BiFunction<String , String , Integer> function = (a , b) -> a.length() + b.length();
	      System.out.println(function.apply("Lakshmi", "Kosre")); // here we performed arithmetic operation which add length of two string
	      
	      System.out.println("    ");
	      
	      System.out.println("After using Binary Operator");
	      
	      BinaryOperator<String> function2 = (str1 , str2) -> str1 + str2 ;
	      System.out.println(function2.apply("Hello", "World")); 

	}

}
