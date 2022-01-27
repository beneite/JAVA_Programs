/*
 *  Program to demonstrate the combination of map and filter....
 */
package streamsInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int id;
	String name;
	int salary;
	
	 Employee(int id, String name, int salary) 
	 {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println("*****************");
		System.out.println("Employee ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		
	}
}

public class MapMethodAdvance {

	public static void main(String[] args) {
		
		List<Employee> emp=Arrays.asList(
				new Employee(1,"ABC",25000),
				new Employee(2,"DEF",15000),
				new Employee(3,"GHI",35000),
				new Employee(4,"JKL",38000),
				new Employee(5,"MNO",28000)
				);

		emp.stream().filter(e->e.salary>25000).forEach(e->e.display());
		
		List<Integer> lsSalary=emp.stream().filter(e->e.salary>25000).map(e->e.salary).collect(Collectors.toList());
		System.out.println("Salaries: "+lsSalary);
	}
}
