package java8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod2 {

	public static void main(String[] args) {
		    
		List<Integer> list = Arrays.asList(2,6,7,8,9,3,56,67,89,23,56,890,2344);
		List<Integer> filteredList = list.stream().filter(x  -> x%2 == 0).map(x -> x/2).sorted((a,b ) ->( b-a)).distinct().limit(4).collect(Collectors.toList());
		System.out.println(filteredList);
		

	}

}
