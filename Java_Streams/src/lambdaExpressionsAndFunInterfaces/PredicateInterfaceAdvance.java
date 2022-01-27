package lambdaExpressionsAndFunInterfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	
	String name;
	int salary;
	int experience;
	
	public Employee(String name,int salary,int experience) {
		this.name=name;
		this.salary=salary;
		this.experience=experience;
	}
}
 
 public class PredicateInterfaceAdvance {
	
	public static void main(String[] args) {

		// display the name of employee having experience>3 and salary>2000.....
		Employee emp=new Employee("Amit",5000,4);
		Predicate<Employee> pr=e->(e.salary>2000 &&e.experience>3);
		if(pr.test(emp)) {
			System.out.println(emp.name);
		}
		
		// using an array of objects...
		ArrayList<Employee> arrEmp=new ArrayList<Employee>();
		arrEmp.add(new Employee("Ashok",4000,4));
		arrEmp.add(new Employee("Biswajeet",1000,2));
		arrEmp.add(new Employee("hitesh",9000,7));
		
		for(Employee empList:arrEmp) {
			if(pr.test(empList)) {
				System.out.println(empList.name+" "+empList.salary+" "+empList.experience);
			}
		}
	}

}
