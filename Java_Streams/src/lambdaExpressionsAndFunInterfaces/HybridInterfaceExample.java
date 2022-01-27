/*   Java program to use the combination of Functional Interfaces...
 * 
 */
package lambdaExpressionsAndFunInterfaces;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EmployeeClassNew
{
	int empID;
	String name;
	int salary;
	
	EmployeeClassNew(int empID,String name,int salary)
	{
		this.empID=empID;
		this.name=name;
		this.salary=salary;
	}
}

public class HybridInterfaceExample {

	public static void main(String[] args) {

	    ArrayList<EmployeeClassNew> arr=new ArrayList<>();
		arr.add(new EmployeeClassNew(1,"A",3000));
		arr.add(new EmployeeClassNew(2,"B",4000));
		arr.add(new EmployeeClassNew(3,"C",5000));
		arr.add(new EmployeeClassNew(4,"D",2000));
		arr.add(new EmployeeClassNew(5,"E",4500));
		
		// Condition 1: Salary should be >3000....
		Predicate<Integer> sal=n->n>300;
		
		// Condition 2: compute the bonus...
		Function<EmployeeClassNew,Integer> bonusCalculator=s->(s.salary*10)/100;
		
		// Consumer to print data....
		Consumer<EmployeeClassNew> con=e->
		{
			System.out.println("Employee ID:"+e.empID);
			System.out.println("Name: "+e.name);
			System.out.println("Salary: "+e.salary);
		};
		
		for(EmployeeClassNew emp:arr)
		{
			int bonus=bonusCalculator.apply(emp);
			if(sal.test(bonus)) {
				con.accept(emp);
				System.out.println("Bonus: "+bonus);
				System.out.println("********************************");
			}
		}

		
	}

}
