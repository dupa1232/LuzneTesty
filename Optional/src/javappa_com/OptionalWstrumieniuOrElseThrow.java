package javappa_com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalWstrumieniuOrElseThrow {
    public static void main(String[] args) {
        List<String> itemNames = new ArrayList<>();
        Optional<String> optionalItem = itemNames.stream().findFirst();
        useOptional(optionalItem);
    }

    public static void useOptional(Optional<String> itemOptional) {
        if(itemOptional.isPresent()) {
            System.out.println("First item");
        }
        System.out.println(itemOptional.orElseThrow(() -> new RuntimeException("brak szitu")));

        /*
        Takie wywo³anie jak wy¿ej ejst prawid³owe, bo gdy bêdzie:
        List<String> itemNames = Arrays.asList("asss");
        to wy¶wietli siê:
        First item
        asss

        Natomiast, gdy zamienimy na:
        List<String> itemNames = new ArrayList<>();
        to poleci RuntimeException z tre¶ci± jak wy¿ej. Czyli orElseThrow rzuca wyj±tkiem,
        gdy nie znajdzie warto¶ci, w przeciwnym razie pobiera warto¶æ.
         */
    }
}
