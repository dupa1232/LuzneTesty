package sheBang.Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("baa");
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("dupaaa"));
        optional.ifPresent(wsad -> System.out.println(wsad.charAt(0)));

        //// mojeeeee
//        Optional<String> optional2 = Optional.of(null); //// w takim przypadku siê wywali!
        // trzeba uzyc ponizszego
        Optional<String> optional2 = Optional.ofNullable(null);
        System.out.println(optional2.isPresent());
//        System.out.println(optional2.get()); // w tym przypadku nie moze tak byæ, bo leci NoSUchElementException
        System.out.println(optional2.orElse("dupaaa2"));
        optional2.ifPresent(zxc -> System.out.println(zxc.charAt(0)));
        /// to powyzsze nic nie wyswietla, bo traktuje to jako "empty" i tak

        /*
        Wy¶wietli:
        true
        baa
        baa
        b
        false
        dupaaa2
         */
    }
}
