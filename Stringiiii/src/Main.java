import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String asd = "asd";
        String asd2 = "asd";
        String asd3 = new String("asd");
        String asd4 = new String("asd");
        String asd5 = asd3;
        String asd6 = asd2;

        System.out.println(asd == asd2); // true
        System.out.println(asd3 == asd4); // false
        System.out.println(asd3 == asd5); // true
        System.out.println(asd6 == asd2); // true

        String abc = new String("abc");
        String qqq = abc.intern();
        System.out.println(abc == qqq); //false

        String abc2 = new String("abcd");
        String qqq2 = abc2;
        System.out.println(abc2 == qqq2); // true

        StringTokenizer stringTokenizer = new StringTokenizer("dupa jasia i koniec");
        System.out.println(stringTokenizer.countTokens()); /// 4

        StringJoiner joiner = new StringJoiner("");
        String result = joiner.add("Ania").add("ma").add("kota").toString();
        System.out.println(result); //Aniamakota

        StringJoiner joiner2 = new StringJoiner(",", "{", "}");
        String result2 = joiner2.add("Ania").add("ma").add("kota").toString();
        System.out.println(result2); // {Ania,ma,kota}


        List<String> names = Arrays.asList("Ania", "Karol", "Bartek", "Jerzy");
        String allNames = "";
        allNames = allNames.join(", ", names);
        System.out.println(allNames); //Ania, Karol, Bartek, Jerzy


        List<String> names2 = Arrays.asList("Ania", "Karol", "Bartek", "Jerzy");
        String allNames2 = names2.stream().collect(Collectors.joining(", ", "{", "}"));
        System.out.println(allNames2); // {Ania, Karol, Bartek, Jerzy}


        String s1 = "TAT";
        String s2 = "TAT";
        String s3 = new String("TAT");
        String s4 = new String("TAT");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1 == s2); // true
        System.out.println(s2 == s3); // false
        System.out.println(s3 == s4); // false


        /*
        https://www.geeksforgeeks.org/strings-in-java/?ref=lbp
        https://javastart.pl/baza-wiedzy/klasy/stringjoiner

         */
    }
}
