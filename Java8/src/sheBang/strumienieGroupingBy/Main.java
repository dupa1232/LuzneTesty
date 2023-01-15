package sheBang.strumienieGroupingBy;

import sheBang.interfejsFunkcyjny.Perosn;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Perosn> listOfPersons = Arrays.asList(new Perosn("jacek", "placej"),
                new Perosn("jacek", "placej"),
                new Perosn("pawel", "placej"),
                new Perosn("zosia", "placej"),
                new Perosn("pawel", "placej"),
                new Perosn("andrzej", "placej"),
                new Perosn("jacek", "placej"),
                new Perosn("zdzichu", "placej"));

        Map<String, Long> wynik = listOfPersons.stream().collect(
                Collectors.groupingBy(Perosn::getFirstName, Collectors.counting())
        );
        System.out.println(wynik);
        //{jacek=3, zdzichu=1, pawel=2, andrzej=1, zosia=1}

        //https://stackoverflow.com/questions/109383/sort-a-mapkey-value-by-values
        Stream<Map.Entry<String, Long>> sortedWynik =
                wynik.entrySet().stream().sorted(Map.Entry.comparingByKey());

        Map<String, Long> xxx = sortedWynik.collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (a,b) -> a, LinkedHashMap::new
        ));
        System.out.println(xxx);
        //{andrzej=1, jacek=3, pawel=2, zdzichu=1, zosia=1}
    }
}
