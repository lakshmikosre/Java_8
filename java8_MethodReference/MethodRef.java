package java8_MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodRef {

	public static void print(String s) {
		
		System.out.println(s);
	}
	
	public static void main(String [] args) {
		
		List<String> students = Arrays.asList("Rohit" , "Virat" , "Dhoni");
		students.forEach(MethodRef :: print); 
	
		// The double colon (::) operator, also known as method reference operator in Java, 
		// is used to call a method by referring to it with the help of its class directly. 
		// They behave exactly as the lambda expressions.
		
	}

}
