package java8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {

	public static void main(String[] args) {
	        
		List<Integer> list = Arrays.asList(1,2,34,5,6,7,8,9,54,5667,767,234,7668);
		List<Integer>filteredList = list.stream().filter(n  -> n%2 == 0).map(x  -> x*2).collect(Collectors.toList());
		System.out.println(filteredList);
		
		List<Integer> mappedList  = list.stream().map(x  -> x*2).collect(Collectors.toList());
		System.out.println(mappedList);
		
		
	}
                                                                                                                                
}
