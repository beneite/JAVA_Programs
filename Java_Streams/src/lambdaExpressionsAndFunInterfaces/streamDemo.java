// using user defined functional Interface......
package lambdaExpressionsAndFunInterfaces;

// without parameter....
@FunctionalInterface
interface lambdaDemo{  
    public void display();  
}  

// with single parameter....
@FunctionalInterface
interface lambdaDemoWithParameter{  
    public void displayName(String name);  
}  

//with return....
@FunctionalInterface
interface lambdaDemoWithReturn{  
 public String greetingMessage(String message);  
}  


public class streamDemo {

	public static void main(String[] args) {
		
		lambdaDemo ld=()->System.out.println("lambda expression without parameter");
		ld.display();
		
		lambdaDemoWithParameter ldp=(String name)->System.out.println("hello "+name);
		ldp.displayName("Ashish");
		
		lambdaDemoWithParameter ldp2=cityName->System.out.println("Welcome to  "+cityName);
		ldp2.displayName("Pune");
		
		// returning through lambda method
		lambdaDemoWithReturn ldr=(cityName)->{
			System.out.println("********************************************");
			return "Welcome to "+cityName;
		};
		System.out.println(ldr.greetingMessage("Pune"));
		
		
		
	}
}
