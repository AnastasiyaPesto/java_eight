package pesto.functionalinterface;

@FunctionalInterface
public interface Converter<F, T> {
	T convert(F from);
}
