package java8_Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class DeclarativeMethod {

	public static void main(String[] args) {
		
		int array[] = {  1,2,3,4,5,6,7,8,9,10 };
		
		// Now using declarative and functional programming 
		
		int sum = Arrays.stream(array).filter( n  -> n%2 ==0 ).sum();
		
		System.out.println("Sum of even numbers in an Array :  " + sum);
		

	}

}
