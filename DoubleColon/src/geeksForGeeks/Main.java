package geeksForGeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main extends Test {

    public static void main(String[] args) {
        /*
        https://www.geeksforgeeks.org/double-colon-operator-in-java/

        When and how to use double colon operator?
        Method reference or double colon operator can be used to refer:

            1) a static method,
            2) an instance method, or
            3) a constructor.
        */

        // ----------------------
        Stream<String> stream = Stream.of("Geeks", "for", "geeks", "a", "computer", "portal");
        stream.forEach(System.out::println);

        /////////////////////// 1) Static method
        //Skladnia ->>> (ClassName::methodName)
        List<String> list = new ArrayList<>();
        list.add("Geeks");
        list.add("for");
        list.add("geeks");
        System.out.println(" 1)))))))))))");
        list.stream().forEach(Main::someFunction);
        /////////////////////// 1)

        /////////////////////// 2) Instance method
        //Sladmoa ->>> (objectOfClass::methodName)
        System.out.println(" 2))))))))))");
        list.forEach(new Main()::someFunction2);
        /////////////////////// 2)


        /////////////////////// 3) Super method
        //(super::methodName)
        System.out.println(" 3))))))))))))))");
        list.forEach(new Main()::print);
        /*
        Hello Geeks
        Bye Geeks

        Hello for
        Bye for

        Hello geeks
        Bye geeks
         */

        /////////////////////// 3)


        /////////////////////// 4) Instance method of an arbitrary object of a particular type (Metoda instancji dowolnego obiektu okre¶lonego typu)
        System.out.println("4 )))))))))))))))))))))))))))");
        List<Test4> list4 = new ArrayList<>();
        list4.add(new Test4("Geeks"));
        list4.add(new Test4("for"));
        list4.add(new Test4("GEEKS"));
        list4.forEach(Test4::someFunction4);
        /////////////////////// 4) Instance method of an arbitrary object of a particular type (Metoda instancji dowolnego obiektu okre¶lonego typu)

    }

    static void someFunction(String s) {
        System.out.println(s);
    }

    void someFunction2(String s) {
        System.out.println(s);
    }

    /////////////////////// 3)

    @Override
    String print(String str) {
        Function<String, String> func = super::print;
        String newValue = func.apply(str);
        newValue += "Bye " +str+ "\n";
        System.out.println(newValue);

        return newValue;
    }

    /////////////////////// 3)

}

class Test4 {
    String str = null;

    public Test4() { }

    public Test4(String str) {
        this.str = str;
    }

    void someFunction4() {
        System.out.println(this.str);
    }
}

class Test {
    String print(String str) {
        return ("Hello " +str+ "\n");
    }
}
