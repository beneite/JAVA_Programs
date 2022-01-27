// joining predicates with AND, OR, NEGATE.....
package lambdaExpressionsAndFunInterfaces;

import java.util.function.Predicate;

/*  p1-> checks if number is even...
 *   p2-> checks number is > 20....
 */
public class PredicateInterfaceProfessional {

	public static void main(String[] args) {
		
		int arr[]= {1,5,6,8,22,26,56,80,100};
		
		Predicate<Integer> p1=e->(e%2==0);
		Predicate<Integer> p2=j->(j>20);
		
		for(int i:arr) {
			if(p1.and(p2).test(i))                             //can also be written as p1.test(i) && p2.test(i).......
			{
				System.out.println(i);
			}
		}
		System.out.println("**************************");
		for(int i:arr) 												
		{
			if(p1.or(p2).test(i)) 						//can also be written as p1.test(i) || p2.test(i).......
			{
				System.out.println(i);
			}
		}

	}

}
