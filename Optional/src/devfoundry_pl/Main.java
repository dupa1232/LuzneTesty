package devfoundry_pl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Optional<Employee> employee = EmployeeRepository.find("Pawel");

        if(employee.isPresent()) {
            Employee emp = employee.get();
            System.out.println(emp.getName());
        }
        /*
        isPresent() zwróci nam boolean w zale¿no¶ci od tego, czy Optional jest pusty, czy nie. Mamy do dyspozycji równie¿ jego lustrzane odbicie ? .isEmpty().
        U¿ywamy powy¿ej te¿ metody .get(), która zwróci nam obiekt opakowany w Optional. Nale¿y tu siê mieæ na baczno¶ci, poniewa¿ je¶li wywo³amy na pustym obiekcie .get()
        zostanie rzucony nam runtime exception, st±d te¿ zawsze nale¿y pamiêtaæ o poprzedzeniu wywo³ania tej metody sprawdzeniem, czy Optional na pewno jest wype³niony.
         */

        ///// 2)))))))) - Optional mo¿na te¿ dla strumieni stosowaæ
        employee.ifPresent(emp -> System.out.println(emp.getName() + " --- 2))))))))"));

        //// .filter() i .map() dla przy strumieniach z Optional /////////////////////////////////////////////
        Optional<String> optionalEmployee = employee.map(Employee::getName);
        optionalEmployee.map(String::toUpperCase).ifPresent(System.out::println);

        //powy¿sze, ale w jednym wyra¿eniu
        employee.map(Employee::getName).map(String::toUpperCase).ifPresent(System.out::println);


        List<String> lista = optionalEmployee.filter(x -> x.startsWith("x")).stream().collect(Collectors.toList());
        System.out.println(lista + " + listaaa");

        employee.filter(e -> e.getAge() > 20).map(Employee::getName).map(String::toUpperCase).ifPresent(System.out::println);

        //// .filter() i .map() dla przy strumieniach z Optional /////////////////////////////////////////////


        ////////// gdy optional jest pusty /////////////////////////////////////
        // mozna np. rzucic wyjatkiem, gdu nie znajdziemy
        ///////////////////////////////////////////////// zakomentowane, ¿eby siê nie wywala³o
//        String stringg = employee.filter(x -> x.getAge() > 25)
//                .map(Employee::getName)
//                .map(String::toUpperCase)
//                .orElseThrow(() -> new RuntimeException("Nie znaleziono zadnego pracownika"));
//        System.out.println(stringg); // nie wy¶wietli nic, bo rzucany jest wcze¶niej wyjatek
        ////////// gdy optional jest pusty /////////////////////////////////////
        /////////////////////////////////////////////////// zakomentowane, ¿eby siê nie wywala³o

        //////// JAVA 9 Optional /////////////////////////////////
        System.out.println("JAVA 999999999999999");
        Optional<Employee> optionalEmployee2 = EmployeeRepository.find("Pawelo");

        // przyk³ad dzia³ania .or() - jak nie znajdzie "Pawel", to dodaje w locie nowego uzytkownika - Jacek
        optionalEmployee2.or(() -> Optional.of(new Employee("Jacek", 44)))
                .filter(emp -> emp.getAge() > 30)
                .map(Employee::getName)
                .map(String::toUpperCase).ifPresent(System.out::println);

        // przyklad dzialania .isPresentOrElse()
        Optional<Employee> optionalEmployee3 = EmployeeRepository.find("Jacek");
//        optionalEmployee3.filter(emp -> emp.getAge() > 30)
//                .map(Employee::getName)
//                .map(String::toUpperCase)
//                .isPresentOrElse(employee -> System.out.println(employee), () -> System.out.println("Nie znaleizono pracownika"));
        /// tak powinno to wygl±daæ, gdyby wersja javy by³a odpowiednia

        //////// JAVA 9 Optional /////////////////////////////////
    }
}
