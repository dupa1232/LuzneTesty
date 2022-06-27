package baeldung_com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        //////////////////////////////////////////
        //From Lambdas to Double Colon Operator //
        //////////////////////////////////////////

        //lambady
//        Comparator c = (Computer c1, Computer c2) -> c1.getAge().compareTo(c2.getAge()); // nie wiem, dlaczego to kurestwo nie dzia³a
//        Comparator c = (c1, c2) -> c1.getAge().compareTo(c2.getAge()); // nie wiem, dlaczego to kurestwo nie dzia³a
        Comparator comparator = Comparator.comparing(Computer::getAge);


        //////////////////////////////////////////
        //////////// How does it work? ///////////
        //////////////////////////////////////////
        Computer c1 = new Computer(2,51, "as");
        Function<Computer, Integer> getAge = Computer::getAge;
        Integer computerAge = getAge.apply(c1);


        ////////////////////////////////////////// Method references ///////////////////////////////////////////
        //////////////////////////////////////////
        //////////// A static method /////////////
        //////////////////////////////////////////
        List<Computer> computerList = Arrays.asList(new Computer(3,80,"xxx"), new Computer(5,20,"xxx2"), new Computer(10,100,"xxx3"));
        computerList.stream().forEach(ComputerUtils::repair);

        Computer c2 = new Computer(5,11,"assdd");
        List<Computer> listaKomputerow = Arrays.asList(c1, c2);
        listaKomputerow.forEach(Computer::turnOnPC);
        System.out.println("xxxxxxxxxxxxx");
        listaKomputerow.stream().forEach(Computer::turnOnPC);
    }
}
