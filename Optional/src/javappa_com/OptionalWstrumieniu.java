package javappa_com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalWstrumieniu {
    public static void main(String[] args) {
        List<String> listaStringowDoOptional = Arrays.asList("AppaItem no. 1", "AppaItem no. 2", "AppaItem no. 3");
        Optional<String> optionalZlistyStringPierwszaWartosc = listaStringowDoOptional.stream().findFirst();
        if(optionalZlistyStringPierwszaWartosc.isPresent()) {
            System.out.println("First item");
            System.out.println(optionalZlistyStringPierwszaWartosc.get());
        }
    }
}
