package tutorialspoint_com;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Integer integer1 = null;
        Integer integer2 = Integer.valueOf(20);
        System.out.println("Sum equals to = " +main.sum(Optional.ofNullable(integer1), Optional.of(integer2)));

    }

    public int sum(Optional<Integer> a, Optional<Integer> b) {

        System.out.println("First parameter is present? " +a.isPresent());
        System.out.println("Second parameter is present? " +b.isPresent());

        Integer integer1 = a.orElse(0);
//        Integer integer1 = a.get(); // je¶li podany integer jest null, i nawet je¶li Optional jest zrobiony
//        w sposób .ofNullable(), czyli zwróci dla tego przypadku 'empty', to i tak siê wywali -
//        NoSuchElementException: No value present
        Integer integer2 = b.orElse(0);


        return integer1+integer2;
    }
}
