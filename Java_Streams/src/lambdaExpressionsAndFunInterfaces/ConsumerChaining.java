package lambdaExpressionsAndFunInterfaces;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {


		Consumer<String> con1=n->System.out.println("Hi "+n);
		Consumer<String> con2= l->System.out.println("Welcome to"+l);
		Consumer<String> con3=m->System.out.println("GG0 "+m);

		// Method 1: using andThen....
		con1.andThen(con2).andThen(con3).accept("ABC");

		// Method 2: using andThen and storing it to the another consumer....
		Consumer<String> con4=con1.andThen(con2).andThen(con3);
		con4.accept("Joe");
	}

}
