package lambdaExpressionsAndFunInterfaces;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {

		Function<Integer,Integer> f1=n->n*2;
		Function<Integer,Integer> f2=n->n*n;
		
		System.out.println(f1.andThen(f2).apply(2));
		// andThen: uses the value returned as the parameter..... f1->f2.. 
		
		System.out.println(f1.compose(f2).apply(2));
		// compose: reverse of andThen... f2->f1..
	}

}
