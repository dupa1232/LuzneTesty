package samouczekprogramisty;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Checker<Integer> isOddAnonymous = new Checker<Integer>() {
            @Override
            public boolean check(Integer object) {
                return object % 2 != 0;
            }
        };

        System.out.println(isOddAnonymous.check(4));
        System.out.println(isOddAnonymous.check(5));
        //////////////////////////////////////////////////////
        /////// to smo co wyzej, ale z uzyciem lambda ////////
        //////////////////////////////////////////////////////
        Checker<Integer> isOddLamda = x -> x%2 != 0;
        System.out.println(isOddAnonymous.check(4));
        System.out.println(isOddAnonymous.check(5));

        /////////////////////////////////////////////////////////////////////////////////////////////////
        ////// Przyk�adowe interfejsy funkcyjne, kt�re mo�na implementowa� z java.util.function /////////
        /////////////////////////////////////////////////////////////////////////////////////////////////
        UnaryOperator<Integer> square = x->x*x;
        Supplier<String> someStrin = () -> "some return shit";
        BiConsumer<Integer, Long> multipler = (Integer x, Long y) -> System.out.println(x*y);
        Function<Integer, Long> multiline = x -> {
            if(x != null && x%2 == 0) {
                return (long) x*x;
            }
            else
                return 123L;
        };
        System.out.println(square.apply(2));
        someStrin.get();
        multipler.accept(2,Long.valueOf(5));
        System.out.println(multiline.apply(5));


        /////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////// Odwo�ywanie si� do metod ////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////
        Object objectInstance = new Object();
        IntSupplier equalsMethodObject = objectInstance::hashCode;
        System.out.println(equalsMethodObject.getAsInt());
        // mo�na to por�wna� do
        Object objectInstance2 = new Object();
        System.out.println(objectInstance2.hashCode());


        AAA aaa = new AAA() {
            @Override
            public void asd() {
                System.out.println("aaaaaaa");
            }
        };
        aaa.asd();

        /////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////// Odwo�ywanie si� do metod bez podania instancji /////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////
        ToIntFunction<Object> hashCodeMethodOnClass = Object::hashCode;
        Object objectInstance3 = new Object();
        System.out.println(hashCodeMethodOnClass.applyAsInt(objectInstance3));
        /// Kod bez u�ycia odwo�ania do metody robi�cy dok�adnie to samo wygl�da troch� mniej skomplikowanie:
        Object objectInstance3a = new Object();
        System.out.println(objectInstance.hashCode());


        /////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////// Odwo�ywanie si� do konstruktora //////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////
        Supplier<Object> objectCreator = Object::new;
        System.out.println(objectCreator.get());
        //To samo bez u�ycia referencji metody mo�esz uzyska� w dobrze Ci znany spos�b:
        System.out.println(new Object());

        /////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////// Przyk�ad zastosowania wyra�e� lambda i odwo�ania do metody //////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////
        // Wersja "normalna"
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        for(Integer number : numbers) {
            System.out.println(number);
        }
        // wersja z lambadami
        // a)
        System.out.println("aaaaaaaaaa)))))))))))");
        numbers.stream().forEach(x -> System.out.println(x));
        // b)
        System.out.println("bbbbbbbbbb)))))))))))");
        Consumer<Integer> konsumer = x -> System.out.println(x);
        numbers.forEach(konsumer);
    }

}
@FunctionalInterface
interface Checker<T> { // jakby by� public, to by musia� i�� do oddzielnego pliku
    boolean check(T object);
}
