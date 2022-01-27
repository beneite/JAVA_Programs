/*
 *  program to demonstrate functional interface, which has one parameter and one return.... 
 *   Function <Integer,Integer> ..
 */
package lambdaExpressionsAndFunInterfaces;

import java.util.function.Function;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		// Example 1: Printing Squares of number....
		Function<Integer,Integer> ftr=n->n*n;
		int a=ftr.apply(10);
		int b=ftr.apply(25);
		System.out.println(a+" "+b);
		
		// Example 2: Printing length of String....
		Function<String,Integer> ftrLen=str->str.length();
		int len1=ftrLen.apply("ABC");
		int len2=ftrLen.apply("ASHISH");
		System.out.println(len1+" "+len2);
		
		
	}

}
