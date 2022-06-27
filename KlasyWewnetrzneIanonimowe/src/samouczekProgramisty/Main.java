package samouczekProgramisty;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ///////////////////////////////////////////////////////////////
        ////////////// Tworzenie instancji klas////////////////////////
        ///////////////////////////////////////////////////////////////
        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = outerClass.konstruktor(); // to nie dzia³a. ma to CHYBA zwi±zek z tym, ¿e "rodzic" nie ma dostêpu do zasobów "dziecka"
        OuterClass.InnerClass innerClass = outerClass.konstruktorWewnatrzOuterClass(); // czyli z poziomu OuterClass da siê utworzyæ instancjê InnerClass
        OuterClass.InnerClass innerClass1 = outerClass.new InnerClass();
        OuterClass.InnerClass innerClass2 = new OuterClass().new InnerClass();
//        innerClass2.konstruktorWewnatrzOuterClass(); /// w tym przypadku jest dostêpu z poziomu innerClass do metody z OuterClass!!!!!!!!!!!!!

        ///////////////////////////////////////////////////////////////
        ////////////// Statyczne klasy wewnêtrzne /////////////////////
        ///////////////////////////////////////////////////////////////
        // S± pewne ró¿nice dla statycznej klasy wewnêtrznej, porównuj±c do powy¿szego przypadku, czyli gdy mieli¶my obie klasy "normalne"
        OuterClass2 outerClass2 = new OuterClass2();
        //OuterClass2.InnerClass2 innerClass21 = outerClass2.metodaInnerClass2WOuterClass2Private(); // do tego dostêpu nie mamy, bo jest to metoda private
        OuterClass2.InnerClass2 innerClass21 = outerClass2.metodaInnerClass2WOuterClass2();
        OuterClass2.InnerClass2 innerClass22 = new OuterClass2.InnerClass2(); //// TU JEST G£ÓWNA RÓ¯NICA, bo inaczej w tym przypadku tworzymy instancjê klasy wewnêtrznej
//        innerClass22.metodaInnerClass2WOuterClass2Private(); /// w tym przypadku nie ma dostêpu do metody poza InnerClass2!!! dla obiektu innerClass21 te¿ nie ma mo¿liwo¶ci
//        innerClass22.metodaInnerClass2WOuterClass2(); /// w tym przypadku nie ma dostêpu do metody poza InnerClass2!!! dla obiektu innerClass21 te¿ nie ma mo¿liwo¶ci

        ///////////////////////////////////////////////////////////////
        ////////////// Lokale klasy wewnêtrzne ////////////////////////
        ///////////////////////////////////////////////////////////////

        class LocalSzit {
            @Override
            public String toString() {
                return "Argumenty metody: " + Arrays.toString(args);
            }
        }

        LocalSzit localSzit = new LocalSzit();
        System.out.println(localSzit.toString());
        System.out.println(localSzit); // to i powy¿sza linijka u¿yje nadpisanej metody toString();

        ///////////////////////////////////////////////////////////////
        ////////////// Klasy anonimowe ////////////////////////////////
        ///////////////////////////////////////////////////////////////
        GreetinModule greetinModule = new GreetinModule() {
            @Override
            public void sayHello() {
                System.out.println("i`m saying hello");
            }
        };
        greetinModule.sayHello();

    }

    public interface GreetinModule {
        void sayHello();
    }
}
