package pesto.lambdascope;

import pesto.functionalinterface.Converter;

public class LambdaScopeTest {
	public static void main(String[] args) {
		// Accessing local variables
		int num = 1;
		Converter<Integer, String> stringConverter =
				(from) -> String.valueOf(from + num);
		// num = 3 - так нельзя, так как переменная, котороя используется в лямбда выражении должна быть:
		// - final
		// - implicitly final (после вызова лямбы не использоваться)
		System.out.println(stringConverter.convert(2));

		// Accessing fields and static variables

	}
}
