package javappa_com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalWstrumieniuRzutWyjatku {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        Optional<String> optionalZlisty = lista.stream().findFirst();
        useOptional(optionalZlisty);
    }

    public static void useOptional(Optional<String> optionalItem) {
        if(optionalItem.isPresent())
            System.out.println(optionalItem.get());
        else
            throw new RuntimeException("Nie ma przedmiotuutu");
    }
}
