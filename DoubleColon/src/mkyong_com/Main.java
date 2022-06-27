package mkyong_com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("node", "java", "python", "ruby");

        //// klasa anonimowa
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        ///lambada
        list.forEach(s -> System.out.println(s));

        /// method reference
        list.forEach(System.out::println);

        /*
        There are four kinds of method references:
            - Reference to a static method ClassName::staticMethodName
            - Reference to an instance method of a particular object Object::instanceMethodName
            - Reference to an instance method of an arbitrary object of a particular type ContainingType::methodName?
            - Reference to a constructor ClassName::new
         */



        // przyk³ad sortowania method reference
        String[] stringArray = { "Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);
    }
}
