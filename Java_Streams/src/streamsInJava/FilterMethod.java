/*
 *  Filter method.... 
 */
package streamsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {

	
	public static void main(String[] args) {
		
		// Example 1: to select the Strings having length>1.....
				String[] str= {"ABC","A","tr"};
				List<String> lStr=Arrays.asList(str);
				int count=(int) lStr.stream().filter(s->s.length()>1).count();
				System.out.println("String with length >1 are: "+count);
		
		// Example 2: Select the even numbers from an array and store it into a new Collection....
				List<Integer> ls=Arrays.asList(10,11,12,13,14,15,16);
				List<Integer> lsEven=new ArrayList<>();
				lsEven=ls.stream().filter(n->n%2==0).collect(Collectors.toList());
				System.out.println("New even number list: "+lsEven);
		
		// Example 3: to count the empty Strings.....
				String[] str2= {"ABC","","A","tr","",""};
				List<String> lStr2=Arrays.asList(str2);
				int count2=(int) lStr2.stream().filter(s->s.isEmpty()).count();
				System.out.println("Number of empty Strings are: "+count2);
				
		// Example 4: Using forEach()....
				List<Integer> lr=Arrays.asList(10,12,20,32,40);
				System.out.println("O/P after using forEach(): ");
				lr.stream().filter(n->n%10==0).forEach(n->System.out.print(n+" "));
	}

}
