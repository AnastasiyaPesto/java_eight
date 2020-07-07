package pesto.functionalinterface;

public class FunctionalInterfaceEx {
	public static void main(String[] args) {
		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		Integer result = converter.convert("123");
		System.out.println(result);
	}
}
