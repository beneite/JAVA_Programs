package streamsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {

	public static void main(String[] args) {

		// Example 1: to convert Strings to upper case....
				List<String> ls=Arrays.asList("abc","deF","ghi");
				List<String> lsForUpperCase=new ArrayList<>();
				lsForUpperCase=ls.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
				System.out.println(lsForUpperCase);
				
		// Example 2: calculate the length of string and push it into another collection....
				List<String> ls2=Arrays.asList("abcef","deF","ghit","a","");
				List<Integer> lsSize=new ArrayList<>();
				// method 1: storing the result in collection...
						lsSize=ls2.stream().map(str->str.length()).collect(Collectors.toList());
						System.out.println("Size of strings are: "+lsSize);
				
				// method 2: simply displaying the results....
						System.out.println("Size of strings are: ");
						ls2.stream().map(str->str.length()).forEach(l->System.out.print(l+" "));
	
	
	}

}
