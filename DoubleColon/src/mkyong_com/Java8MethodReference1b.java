package mkyong_com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8MethodReference1b {

 /*
          This example converts a list of Strings into a list of Integers, method reference to a static method Integer::parseInt.

  */
    public static void main(String[] args) {

        List<String> list = Arrays.asList("1","2","3");
        //klasa anonimowa
        List<Integer> collect1 = list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).collect(Collectors.toList());

        /// lambada
        List<Integer> collect2 = list.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());

        ///method reference
        List<Integer> collect3 = list.stream().map(Integer::parseInt).collect(Collectors.toList());
    }
}
