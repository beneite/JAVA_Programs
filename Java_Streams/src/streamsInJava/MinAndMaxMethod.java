/*
 *  program to demonstrate the working of terminal operation of: min(), max().
 */
package streamsInJava;

import java.util.Arrays;
import java.util.Optional;
import java.util.List;

public class MinAndMaxMethod {

	public static void main(String[] args) {

		List<Integer> numberLst=Arrays.asList(2,3,4,5,6,1);
		
		// Example 1: min() operation....
		Optional<Integer> itr=numberLst.stream().min((val1,val2)->{
			                                                                     return val1.compareTo(val2);
																				});
		
		System.out.println("Minimum: "+itr.get());
		
		// Exapmle 2: max() operation....
		Optional<Integer> itr1=numberLst.stream().max((val1,val2)->{
					                                                                     return val1.compareTo(val2);
																						});
				
		System.out.println("Maximum: "+itr1.get());
	}

}
