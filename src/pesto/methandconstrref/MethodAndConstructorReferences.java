package pesto.methandconstrref;

import pesto.functionalinterface.Converter;

public class MethodAndConstructorReferences {
	public static void main(String[] args) {
		//
		Converter<String, Integer> converter = Integer::valueOf;
		System.out.println(converter.convert("123"));

		// method
		Something something = new Something();
		Converter<String, String> converterStr = something::startsWith;
		System.out.println(converterStr.convert("Java"));

		// constructor
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Zentsov", "Ivan");
		System.out.println(person);
	}
}
