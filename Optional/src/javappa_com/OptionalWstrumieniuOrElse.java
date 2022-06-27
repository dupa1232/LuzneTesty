package javappa_com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalWstrumieniuOrElse {
    public static void main(String[] args) {

        List<String> listDoOptional = new ArrayList<>();
        Optional<String> optionalFirstValue = listDoOptional.stream().findFirst();
        useOptional(optionalFirstValue);

        System.out.println("xxxxxxxxxxxxxxxxx ");
        List<String> wartoscJest = Arrays.asList("asddd");
        Optional<String> wartoscJestOptional = wartoscJest.stream().findFirst();
        useOptional(wartoscJestOptional);
    }

    public static void useOptional(Optional<String> itemOptional) {
        if(itemOptional.isPresent())
            System.out.println("First item");
        System.out.println(itemOptional.orElse("ni mo warto¶ci"));
    }

    /*
    Tak wy¶wietli:
    ni mo warto¶ci
    xxxxxxxxxxxxxxxxx
    First item
    asddd

     */
}
