package mkyong_com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> collect = list.stream().filter(x->x>5).collect(Collectors.toList());
        System.out.println(collect); //[6, 7, 8, 9, 10]


        ///////// z Predicate!!!!!!!
        Predicate<Integer> notGreaterThan5 = x->x>5;
        List<Integer> collect2 = list.stream().filter(notGreaterThan5).collect(Collectors.toList());
        System.out.println(collect2); //[6, 7, 8, 9, 10]
    }
}
