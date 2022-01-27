package lambdaExpressionsAndFunInterfaces;

import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
		
		Consumer<String> con=s->System.out.println(s);
		
		con.accept("Hello");

	}

}
