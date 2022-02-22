import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /*
        Na podstawie https://www.geeksforgeeks.org/stream-in-java/
         */

        /*
        Operacje po¶rednie na strumieniach
         */
        //////////////////////////////////////////////////////////////////////////////////////////////////  map
        List<Integer> number = Arrays.asList(2,3,4,5,3);
        List square = number.stream().map(x->x*x).collect(Collectors.toList());
        number.stream().map(x -> x*x).forEach(x -> System.out.println(x)); // 4,9,16,25,9
        number.stream().collect(Collectors.toSet()).forEach(y -> System.out.println(y));// 2,3,4,5

        /////////////////////////////////////////////////////////////////////////////////////////////  filter
        List<String> names = Arrays.asList("Reflection","Collection","Stream", "sexk");
        List result = names.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
        names.stream().filter(s -> s.toUpperCase().startsWith("S")).forEach(x -> System.out.print(x+ ", ")); //Stream, sexk,

        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////  sorted
        List<String> names2 = Arrays.asList("Reflection","Collection","Stream");
        List result2 = names2.stream().sorted().collect(Collectors.toList());
        result2.stream().forEach(x -> System.out.print(x+", ")); //Collection, Reflection, Stream,
        System.out.println();
        Comparator<String> porownywac = (x, y) -> (y.compareTo(x));
        names2.stream().sorted(porownywac).forEach(x -> System.out.print(x+ ", ")); // Stream, Reflection, Collection

        /*
        Operacje koñcz±ce na strumieniach
        */

        ////////////////////////////////////////////////////////////////////////////////// collect
        System.out.println("Operacje koñc±±±ce\\n\\n");
        ///////////////////////////////////////////////////////////////////////////////////// forEach
        List<Integer> numberr = Arrays.asList(2,3,4,5);
        numberr.stream().map(x->x*x).forEach(y->System.out.println(y));//4 9 16 25
        numberr.stream().map(entrySzit -> {
            if(entrySzit > 3)
                entrySzit = entrySzit*entrySzit;
            return entrySzit;
        }).forEach(x -> System.out.print(x + ",, ")); //2,, 3,, 16,, 25,,

        //////////////////////////////////////////////////////////////////////////////// reduce
        System.out.println();
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i); // z listy 2,3,4,5,3, bierze te, których modulo == 0, czyli 2,4. Pocz±tkow± warto¶ci± jest identity = 0 i do nich dodaje 2+4 = 6
        System.out.println(even); // 6. Jakby identity by³o 4, to wynik by³by 10

        //https://www.baeldung.com/java-stream-reduce
        System.out.println();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int resulte = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(resulte); // dla reduce(0,... , zwróci 21 ; dla reduce(2,... , zwróci 23

        List<String> lista = Arrays.asList("spadaj", "dupa", "cipa", "ser", "swoboda", "oko");
        String listaResult = lista.stream().reduce(",",(dupa, penis) -> (dupa+penis));
        System.out.println(listaResult); // ,spadajdupacipaserswobodaoko


        System.out.println();
        System.out.println();
        ////// sortowanie
        List<String> names22 = Arrays.asList("Reflection","Collection","Stream");
        names22.stream().sorted((x,y) -> y.compareTo(x)).forEach(x -> System.out.print(x+ ", ")); // Stream, Reflection, Collection
    }
}
