package pesto.predicates;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicatesTest {
  public static void main(String[] args) {
    Predicate<String> predicate = (s) -> s.length() > 0;
    System.out.println(predicate.test("foo"));
    System.out.println(predicate.negate().test("foo"));

    Predicate<Boolean> nonNull = Objects::nonNull;
    Predicate<Boolean> isNull = Objects::isNull;
    Boolean bool = null;
    System.out.println(nonNull.test(bool));
    System.out.println(isNull.test(bool));

    Predicate<String> isEmpty = String::isEmpty;
    Predicate<String> isNotEmpty = isEmpty.negate();
    System.out.println(isEmpty.test(""));
    System.out.println(isNotEmpty.test("Hello"));

    Predicate<Integer> predicateTest = (i) -> i.compareTo(0) > 0;
    System.out.println(predicateTest.test(0));
    System.out.println(predicateTest.and((i) -> i.compareTo(8) > 0).test(3));
    Predicate predIsEqual = Predicate.isEqual(16);
    System.out.println(predIsEqual.test(17));
  }
}
