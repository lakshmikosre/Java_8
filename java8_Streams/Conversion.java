package java8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Conversion {

	public static void main(String[] args) {
		 
		List<String>list = Arrays.asList("Apple","Banana","Orange");
		Stream<String>myStream = list.stream();
		
		String[] array = { "Apple","Banana","Orange" };
		Stream<String> myStream2 = Arrays.stream(array);
		
		Stream<Integer>IntegerStream = Stream.of(1,2,3);
		
		Stream<Integer>limit = Stream.iterate(0,n  -> n+1).limit(100);
		
		
		
		
		
	}

}
