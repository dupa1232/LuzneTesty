package samouczekprogramisty;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zadanie1 {
    /*
    https://www.samouczekprogramisty.pl/wyrazenia-lambda-w-jezyku-java/
    Zadanie 1
     */
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("dupa", "cipa", "penis", "a", "omnomnom");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort((a,b) -> Zadanie1.compare(a,b));
        System.out.println(lista);
    }

    public static int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

