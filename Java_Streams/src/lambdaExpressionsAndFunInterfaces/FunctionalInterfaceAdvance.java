/*
 *  using functional interface to incerement the ssalary of an employee....
 */
package lambdaExpressionsAndFunInterfaces;

import java.util.ArrayList;
import java.util.function.Function;

class EmployeeClass{
	String name;
	int salary;
	
	 EmployeeClass(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
}

public class FunctionalInterfaceAdvance {

	public static void main(String[] args) {

		ArrayList<EmployeeClass> arr=new ArrayList<>();
		
		arr.add(new EmployeeClass("Hitesh",1000));
		arr.add(new EmployeeClass("ABC",2000));
		arr.add(new EmployeeClass("DEF",3000));
		arr.add(new EmployeeClass("GHI",4000));
		
		Function<EmployeeClass,Integer> ftr1=e->{
			int sal=e.salary;
			if(sal<2000) {
				sal=sal*2;
				return sal;
			}
			else if(sal<3000){
				sal=sal*3;
				return sal;
			}
				else{
					sal=sal*4;
					return sal;
				}
		                         };
		                         
		     for(EmployeeClass ec:arr) {
		    	 int salary=ftr1.apply(ec);
		    	 System.out.println(ec.name+" "+salary);
		}
				}

}
