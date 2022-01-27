/*
 *     In this program we will store the laptops having cost > 50000 in another collection....
 */
package streamsInJava;

import java.util.ArrayList;
import java.util.function.Predicate;

class Laptop
{
	int id;
	String name;
	int price;
	
	Laptop(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public void displayDetails()
	{
		System.out.println("***********************");
		System.out.println("ID: "+id);
		System.out.println("Laptop name: "+name);
		System.out.println("Price: "+price);
	}
}


public class FilterMethodAdvance {

	public static void main(String[] args) {

		ArrayList<Laptop> arrLp=new ArrayList<Laptop>();
		
		arrLp.add(new Laptop(1,"HP Laptops", 35000));
		arrLp.add(new Laptop(2,"DELL Laptops", 55000));
		arrLp.add(new Laptop(3,"Apple Laptops", 45000));
		arrLp.add(new Laptop(4,"VIVO Laptops", 51000));
		arrLp.add(new Laptop(5,"Lenevo Laptops", 65000));
		arrLp.add(new Laptop(6,"Acer Laptops", 85000));
		
		Predicate<Laptop> pr=n->n.price>50000;
		
		// Method 1: using Lambda statement directly....
		arrLp.stream().filter(p->p.price>50000).forEach(p->p.displayDetails());
		
	}

}
