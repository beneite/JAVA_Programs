// program to demonstrate the working of predicate Interface....
package lambdaExpressionsAndFunInterfaces;

import java.util.function.Predicate;

public class predicateInterface {

	public static void main(String[] args) {
		
		// checking the value provided greater or not....
		Predicate<Integer> pdr=i->(i>10);
		System.out.println(pdr.test(20));
		System.out.println(pdr.test(5));
		
		// checking the length of the string greater than the specified value.....
		Predicate<String> pdr2=name->(name.length()>10);
		System.out.println(pdr2.test("Ashish"));
		System.out.println(pdr2.test("Ashish Mishra"));
		
		// print name whose size is greater than the specified value.....
		String names[]= {"Ashish","Aditya Mishra","abc"};
		for(String name:names) {
			if(pdr2.test(name)) {
			System.out.println(name);
			}
		}
	}

}
