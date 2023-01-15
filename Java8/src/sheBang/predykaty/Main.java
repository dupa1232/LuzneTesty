package sheBang.predykaty;

import java.util.Objects;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length() > 0;
        System.out.println(predicate.test("aaaa"));             /// ture
        System.out.println(predicate.negate().test("b"));       /// false

        // domyslne metody, juz istniejace w predykatach
        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;
        // domyslne metody, juz istniejace w predykatach

        System.out.println(nonNull.test(null));                 // false
        System.out.println(nonNull.test(true));                 // true
        System.out.println(isNull.test(null));                  // true

        //Przyklad laczenia
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
        System.out.println(isNotEmpty.test("zzz"));             // true

        //////// moje
        Predicate<Integer> predykatIntidzer = x -> x >= 0 && x <= 10;
        System.out.println(predykatIntidzer.test(2));           //true
        System.out.println(predykatIntidzer.test(11));          //false
    }
}
