package samouczekProgramisty;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ///////////////////////////////////////////////////////////////
        ////////////// Tworzenie instancji klas////////////////////////
        ///////////////////////////////////////////////////////////////
        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = outerClass.konstruktor(); // to nie dzia�a. ma to CHYBA zwi�zek z tym, �e "rodzic" nie ma dost�pu do zasob�w "dziecka"
        OuterClass.InnerClass innerClass = outerClass.konstruktorWewnatrzOuterClass(); // czyli z poziomu OuterClass da si� utworzy� instancj� InnerClass
        OuterClass.InnerClass innerClass1 = outerClass.new InnerClass();
        OuterClass.InnerClass innerClass2 = new OuterClass().new InnerClass();
//        innerClass2.konstruktorWewnatrzOuterClass(); /// w tym przypadku jest dost�pu z poziomu innerClass do metody z OuterClass!!!!!!!!!!!!!

        ///////////////////////////////////////////////////////////////
        ////////////// Statyczne klasy wewn�trzne /////////////////////
        ///////////////////////////////////////////////////////////////
        // S� pewne r�nice dla statycznej klasy wewn�trznej, por�wnuj�c do powy�szego przypadku, czyli gdy mieli�my obie klasy "normalne"
        OuterClass2 outerClass2 = new OuterClass2();
        //OuterClass2.InnerClass2 innerClass21 = outerClass2.metodaInnerClass2WOuterClass2Private(); // do tego dost�pu nie mamy, bo jest to metoda private
        OuterClass2.InnerClass2 innerClass21 = outerClass2.metodaInnerClass2WOuterClass2();
        OuterClass2.InnerClass2 innerClass22 = new OuterClass2.InnerClass2(); //// TU JEST G��WNA RӯNICA, bo inaczej w tym przypadku tworzymy instancj� klasy wewn�trznej
//        innerClass22.metodaInnerClass2WOuterClass2Private(); /// w tym przypadku nie ma dost�pu do metody poza InnerClass2!!! dla obiektu innerClass21 te� nie ma mo�liwo�ci
//        innerClass22.metodaInnerClass2WOuterClass2(); /// w tym przypadku nie ma dost�pu do metody poza InnerClass2!!! dla obiektu innerClass21 te� nie ma mo�liwo�ci

        ///////////////////////////////////////////////////////////////
        ////////////// Lokale klasy wewn�trzne ////////////////////////
        ///////////////////////////////////////////////////////////////

        class LocalSzit {
            @Override
            public String toString() {
                return "Argumenty metody: " + Arrays.toString(args);
            }
        }

        LocalSzit localSzit = new LocalSzit();
        System.out.println(localSzit.toString());
        System.out.println(localSzit); // to i powy�sza linijka u�yje nadpisanej metody toString();

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
