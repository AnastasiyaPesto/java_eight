package pesto.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressions {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

    //  before Java 8
    Collections.sort(names, new Comparator<String>() {
      @Override
      public int compare(String a, String b) {
        return b.compareTo(a);
      }
    });
    System.out.println("По уменьшению:");
    for (String name : names) {
      System.out.println(name);
    }

    // sicne Java 8
    Collections.sort(names, (String a, String b) -> {
      return b.compareTo(a);
    });

    Collections.sort(names,  (a, b) -> b.compareTo(a));

    names.sort((a, b) -> b.compareTo(a));
  }
}
