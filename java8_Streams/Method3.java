package java8_Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Method3 {

	public static void main(String[] args) {
		
		List<Integer> collect = Stream.iterate(0 , x  -> x+1).limit(102).skip(1).filter(x -> x%2 ==0).map(x  -> x*2).distinct().sorted().collect(Collectors.toList());
		System.out.println(collect);

	}

}
