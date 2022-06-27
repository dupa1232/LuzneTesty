package baeldung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalMainBaeldung {

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        System.out.println(optional.isPresent()); // false
        System.out.println(optional.isEmpty()); // true

        Optional<String> stringOptional = Optional.ofNullable(null);
        System.out.println(stringOptional.isPresent()); //false
        System.out.println(stringOptional.isEmpty()); // true


        //////////////////////////////////// ifPresent()
        Optional<String> ass = Optional.of("asssss");
        ass.ifPresent(x -> System.out.println(x.length())); // 6

        //////////////////////////////////// orElse()
        Optional<String> orElseDefaultValue = Optional.ofNullable(null);
        String wynik = orElseDefaultValue.orElse("default szit");
        System.out.println(wynik); /// default szit

        Optional<String> orElseDefaultValue2 = Optional.ofNullable("sss");
        String wynik2 = orElseDefaultValue2.orElse("default szit");
        System.out.println(wynik2); /// sss

        /////////////////////////////////// orElseGet()
        Optional<Integer> orElseGetExample = Optional.ofNullable(null);
        Integer wynikOrElseGet = orElseGetExample.orElseGet(() -> Integer.valueOf(123));
        System.out.println(wynikOrElseGet); /// 123

        //////////////////////////////////// orElse() vs orElseGet() - najlepiej jest na stronie baeldunga poczytaæ o tym i postaraæ siê zrozumieæ, bo ¶rednio mi siê uda³o
//        OptionalMainBaeldung opt = new OptionalMainBaeldung();
//        String text = null;
//        System.out.println(Optional.ofNullable(text).orElse(opt.getdefault()));
//        System.out.println(Optional.ofNullable(text).orElseGet(this::getdefault));

        ////////////////////////////////////// orElseThrow()
        String assd = null;
        Optional<String> assdWynik = Optional
                .ofNullable(assd); /// takie co¶ nic nie rzuca; raptem uzupe³nia assdWynik warto¶ci± "empty"
//        String assdWynikStr = Optional
//                .ofNullable(assd).orElseThrow(); /// dla tego przypadku - rzuca domyslnym wyjatkiem, czyli NoSuchElementEx
//        String assdWynikString = Optional
//                .ofNullable(assd).orElseThrow(IllegalArgumentException::new); /// takie cos rzuci zadeklarowany wyjatek

        ////////////////////////////////////// get()
        Optional<String> optionalGet = Optional.of("aaaaaa");
        System.out.println(optionalGet.get()); /////// to zwroci ->>> aaaaaa
        //Nale¿y pamiêtaæ, ze .get() dzia³a, gdy warto¶æ jest inna ni¿ null. W przeciwnym razie leci wyj±tek
        //NoSuchElementException!!!
//        Optional<String> optionalGet2 = Optional.ofNullable(null);
//        System.out.println(optionalGet2.get());

        /////////////////////// filter()
        Optional<Integer> yearOptional = Optional.of(Integer.valueOf(2016));
        boolean is2016 = yearOptional.filter(x -> x == 2016).isPresent();
        System.out.println(is2016); /// true
        boolean is2017 = yearOptional.filter(c -> c == 2017).isPresent();
        System.out.println(is2017); /// false

        System.out.println(yearOptional.filter(z -> z.equals(2016)).isPresent()); /// true
        /*
        w tym celu, czyli filter() powsta³y te¿ metody
        priceIsInRange1()
        priceIsInRange2()
        !!!!!!!!!!!!!!!!!!!!!!!!
         */

        /////////////////////////////////////////// map()
        List<String> companyNames = Arrays.asList(
                "paypal", "oracle", "", "microsoft", "", "apple");
        List<String> companyNames2 = new ArrayList<>();
        List<String> companyNames3 = null;
        // moje
        List<Integer> asdd = companyNames.stream().map(x -> x.length()).collect(Collectors.toList());
        System.out.println(asdd);
        // zwroci -> [6, 6, 0, 9, 0, 5]
        // moje

        Optional<List<String>> listOptional = Optional.of(companyNames);
        int listOptionalLength = listOptional.map(List::size).orElse(666);
        System.out.println(listOptionalLength);
        // zwroci -> 6

        int listOptionalLength2 = Optional.of(companyNames2).map(List::size).orElse(666);
        System.out.println(listOptionalLength2);
        // zwroci -> 0

        System.out.println(Optional.ofNullable(companyNames3).map(List::size).orElse(666));
        // zwroci -> 666
        /////
        String name = "baeldund";
        Optional<String> optBaeldung = Optional.ofNullable(name);
        int lengthName = optBaeldung.map(String::length).orElse(0);
        System.out.println(lengthName);
        // zwroci -> 8

        String password = "password";
        Optional<String> passOpt = Optional.ofNullable(password);
        boolean isCorrect = passOpt.map(String::trim).filter(x -> x.equals("password")).isPresent();
        boolean isntCorrect = passOpt.map(String::trim).filter(x -> x.equals("paSsword")).isPresent();
        System.out.println(isCorrect); // true
        System.out.println(isntCorrect); // false

        //////////////////////////////////////////////////// flatMap()
        // w tym celu powsta³a klasa Person
        Person person = new Person("jacek", 22);
        Optional<Person> optionalPerson = Optional.of(person);

        Optional<Optional<String>> jacek = optionalPerson.map(Person::getName);
        Optional<String> jacek2 = jacek.orElseThrow(IllegalArgumentException::new);
        String jacek3 = jacek2.orElse("asss Jacka");
        //// jeszcze raz, moja tworczosc
//        optionalPerson.map(Person::getName).orElse("asss"); /// tak nie mozna, bo sie rzuca, ze zwracamy
//        // String, a potrzebuje Optional<String>. Potrzebne jest chyba cos takiegok jak nizej:
        //// jeszcze raz, moja tworczosc
        String jacko = optionalPerson.map(Person::getName).orElseThrow(IllegalArgumentException::new).orElse("asss");
        /// a jak wykorzystamy flatMap() to mozemy ten jeden krok pominac i mamy tak:
        optionalPerson.flatMap(Person::getName).orElse("ssss"); /// czyli, je¶li dobrze rozumiem, .orElseThrow() zapewnia rozpakowanie
        // i dziêki temu nie narzeka jak wy¿ej, ¿e potrzebuje Optional<String> a ma String


        ////////////////////////////////////////////////// chaining Optionals in java 8
        OptionalMainBaeldung omb = new OptionalMainBaeldung();
        Optional<String> founf = Stream.of(omb.getEmpty(), omb.getHello(), omb.getHello())
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst();
        System.out.println(founf); /// wyswietli: Optional[Hello]

        /*
        The downside of this approach is that all of our get methods are always executed, regardless of where a non-empty Optional appears in the Stream.
        If we want to lazily evaluate the methods passed to Stream.of(), we need to use the method reference and the Supplier interface:
         */
//        Optional<String> foundWithSupplier = Stream.<Supplier<Optional<String>>>of(omb.getEmpty(), omb.getHello(), omb.getBye())
//                .map(Supplier::get)
//                .filter(Optional::isPresent)
//                .map(Optional::get)
//                .findFirst();
        // nie wiem, dlaczego to rzuca b³êdem

        Optional<String> found = Stream.<Supplier<Optional<String>>>of(
                () -> omb.createOptional("empty"),
                () -> omb.createOptional("hello")
        ).map(Supplier::get)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst();
        System.out.println(found);
        /// Wyswietli: Optional[hello]

        String found2 = Stream.<Supplier<Optional<String>>>of (
                () -> omb.createOptional("empty"),
                () -> omb.createOptional("empty")
        ).map(Supplier::get)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst()
                .orElseGet(() -> "difolt");
        System.out.println(found2); // wy¶wietli: difolt

        System.out.println("///////////////// Misuse of Optionals");
        ////////////////////////////////////////////////////////// Misuse of Optionals
        List<Person> perons = Arrays.asList(new Person("Jacek", 2), new Person("Ass", 15), new Person("xxx", null));
        System.out.println(OptionalMainBaeldung.search(perons,"jacek", Optional.of(22)));
        System.out.println(OptionalMainBaeldung.search(perons, "Ass", Optional.of(10)));
        System.out.println(OptionalMainBaeldung.search(perons, "xxx", null));
        /// tak srednio dzia³a to powy¿sze, ale nie wiem dlaczego :O


    }

    // powsta³o dla ->>>>>> Misuse of Optionals
    public static List<Person> search(List<Person> people, String name, Optional<Integer> age) {
        return people.stream()
                .filter(person -> person.getName().equals(name))
                .filter(p -> p.getAge().get() >= age.orElse(0))
                .collect(Collectors.toList());
    }

    public String getdefault() {
        System.out.println("Getting difolt walju");
        return "DEFAULT VALUE";
    }

    public boolean priceIsInRange1(Modem modem) {
        boolean isInRange = false;

        if(modem != null && modem.getPrice() != null && modem.getPrice() > 10 && modem.getPrice() < 15) {
            isInRange = true;
        }
        return isInRange;
    }

    public boolean priceIsInRange2(Modem modem) {
        return Optional.ofNullable(modem)
                .map(Modem::getPrice)
                .filter(price -> price > 10)
                .filter(price -> price < 15)
                .isPresent();
    }

    /////////////// powsta³o w celu chaining Optionals in java 8
    private Optional<String> getEmpty() {
        return Optional.empty();
    }

    private Optional<String> getHello() {
        return Optional.of("Hello");
    }

    private Optional<String> getBye() {
        return Optional.of("bye");
    }

    private Optional<String> createOptional(String inpur) {
        if(inpur == null || "".equals(inpur) || "empty".equals(inpur))
            return Optional.empty();
        return Optional.of(inpur);
    }
    //////////////// powsta³o w celu chaining Optionals in java 8

}
