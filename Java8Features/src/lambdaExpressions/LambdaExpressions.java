package lambdaExpressions;

public class LambdaExpressions {

	public static void main(String[] args) {
		Mobility s1 = (name) -> {
			System.out.println(name);
		};
		/*
		 * Mobility s2 = (features) -> { System.out.print(features); };
		 */
		s1.brand("Vivo");
	}
}

interface Mobility {

	void brand(String name);/*
							 * String features(String features); String price(double price);
							 */
}
