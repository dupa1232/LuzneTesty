package zachowaniePrzekazywanejIzwracanejList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Klasa {

    List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9);

    public List<Integer> metoda1() {
        return lista.stream().filter(x -> x > 2).collect(Collectors.toList());
    }

    public List<Integer> metoda2(List<Integer> listaaa) {
        return listaaa.stream().filter(x -> x > 5).collect(Collectors.toList());
    }
}
