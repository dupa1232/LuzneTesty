package tutorialspoint_com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // Predicate<Integer> predicate = n -> true
        // n is passed as parameter to test method of Predicate interface
        // test method will always return true no matter what value n has.
        System.out.println("Print all numbers:");
        eval(list, x -> true);

        // Predicate<Integer> predicate1 = n -> n%2 == 0
        // n is passed as parameter to test method of Predicate interface
        // test method will return true if n%2 comes to be zero
        System.out.println("Print even numbers:");
        eval(list, c -> c%2 ==0);

        // Predicate<Integer> predicate2 = n -> n > 3
        // n is passed as parameter to test method of Predicate interface
        // test method will return true if n is greater than 3.
        System.out.println("Print numbers greater than 3:");
        eval(list, a -> a>3);
    }

    public static void eval(List<Integer> list, Predicate<Integer> predykat) {
        for(Integer n : list) {
            if(predykat.test(n))
                System.out.println(n+ "");
        }
    }
}
