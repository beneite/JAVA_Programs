/*
 *  Non-Terminal Operations: filter, map, flatMap, distinct, limit, peek.....
 *  Terminal Operations: anyMatch, allMatch, noneMatch, collect, count, findAny, findFirst, forEach, min, max, reduce, toArray.....
 */
package streamsInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonTerminalAndTerminalOperations {

	public static void main(String[] args) {

	// Example 1: using distinct()...
		List<String> alpha=Arrays.asList("A","A","B","C","C","D","f","F","c");
		List<String> newalpha=alpha.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct operation: "+newalpha);
		
		// appltying distinct with forEach...
		alpha.stream().distinct().forEach(e->System.out.println(e));
		
	// Example 2: counting the Distinct elements...
		long countDistalpha=alpha.stream().distinct().count();
		System.out.println("Count: "+countDistalpha);
		
	// Example 3: using limit to limt the O/P....
		List<String> Limitalpha=alpha.stream().limit(3).collect(Collectors.toList());
		System.out.println("Limitng to 3 O/P: "+Limitalpha);
	}

}
