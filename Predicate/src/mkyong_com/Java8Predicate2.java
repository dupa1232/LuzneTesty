package mkyong_com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate2 {

    ///2.1 Replace with Predicate.and()

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        ////multiple filters
        List<Integer> result = list.stream().filter(s->s>5 && s<8).collect(Collectors.toList());
        System.out.println(result); //[6, 7]

        //////////// multiple Predicate
        Predicate<Integer> notGreaterThan5 = x -> x>5;
        Predicate<Integer> notLessThan8 = x -> x<8;
        List<Integer> result2 = list.stream().filter(notGreaterThan5.and(notLessThan8)).collect(Collectors.toList());
        System.out.println(result2); //[6, 7]
    }
}
