package java8_BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Exp1 {

	public static void main(String[] args) {
		
				 Function<String , Integer> function1 = str  -> str.length();
				 BiFunction<String , String , Integer> function2 = (str1, str2)  ->  str1.length() + str2.length() * str1.length() - str2.length() ;
				 // Here we can take  x and y instead of str1 and str2 
				 // We can use any operator to perform operation on two string 
				 
				 System.out.println(function2.apply("Lakshmi", "Laxmi"));
		         
			}
		          
		}


	
