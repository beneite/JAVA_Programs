/*
 *  using flatMap()....
 */
package streamsInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethod {

	public static void main(String[] args) {

//Example 1:
					List<Integer> ls1=Arrays.asList(1,2);
					List<Integer> ls2=Arrays.asList(3,4);
					List<Integer> ls3=Arrays.asList(5,6);
					
					
					// combining the list together....
							List<List<Integer>> finalList=Arrays.asList(ls1,ls2,ls3);
							System.out.println("Combined List: "+finalList);
							
					// applying flatMap Operation....
							List<Integer> finalLs=finalList.stream().flatMap(e->e.stream()).collect(Collectors.toList());
							System.out.println("List after flatMap() operation:"+finalLs);
							
						
// Example 2:	
						
						List<Integer> newLs=finalList.stream().flatMap(e->e.stream()).map(e->e*2).collect(Collectors.toList());
						System.out.println("New List: "+newLs);

						
		
		
	}

}
