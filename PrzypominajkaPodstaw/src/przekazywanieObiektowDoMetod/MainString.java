package przekazywanieObiektowDoMetod;

public class MainString {

    public static void main(String[] args) {
        KlasaUtilsowa klasaUtilsowa = new KlasaUtilsowa();

        //////////////////////////////////////////// robienieCzegosZeString() //////////////////////////////
        String asd = "dupa";
        System.out.println(asd.hashCode());
        klasaUtilsowa.robienieCzegosZeString(asd);
        /*
        Zwróci³o:

        3095106
        3095106 - jeste¶my w metodzie
        dupa xxxx
        -349866302 --- znowu w metodzie, ale na koñcu
         */

        //////////////////////////////////////////// robienieCzegosZeStringIzwracanie() //////////////////////////////
        System.out.println("\n");
        String asd2 = "kolejnaDupa";
        System.out.println(asd2.hashCode()+ " --- xxx");
        asd2 = klasaUtilsowa.robienieCzegosZeStringIzwracanie(asd2);
        System.out.println(asd2.hashCode()+ " --- yyy");

        /*
        Zwróci³o:
        1487240962 --- xxx
        1487240962 - jeste¶my w metodzie
        kolejnaDupa xxxx
        1736780674 --- znowu w metodzie, ale na koñcu
        1736780674 --- yyy
         */

        //////////////////////////////////////////// robienieCzegosZFinalString() //////////////////////////////
        System.out.println("\n");
        String asd3 = "finalString";
        System.out.println(asd3.hashCode()+ " ---- 1");
        klasaUtilsowa.robienieCzegosZFinalString(asd3);
        System.out.println(asd3.hashCode()+ " ---- 2");

        /*
        Zwróci³o:
        2085854503 ---- 1
        2085854503 --- jestesmy w metodzie, na poczatku
        2085854503 ---- 2

         */


        //////////////////////////////////////////// robienieCzegosZFinalStringIzwracanie() //////////////////////////////
        System.out.println("\n");
        String asd4 = "finalString222";
        System.out.println(asd4.hashCode()+ " ---- 1");
        klasaUtilsowa.robienieCzegosZFinalStringIzwracanie(asd4);
        System.out.println(asd4.hashCode()+ " ---- 2");
        /*
        Zwróci³o:
        104709995 ---- 1
        104709995 --- jestesmy w metodzie, na poczatku
        104709995 ---- 2
         */

        ///////////////////////////////////////// przyjmuje final String metoda/ /////////////////////////////////////////
        System.out.println("\n");
        final String xxx = "xxxx";
        System.out.println(xxx.hashCode()+ " ---- 1");
        String xxx2 = klasaUtilsowa.robienieCzegosZeStringIzwracanie(xxx); /// trzeba by³o now± zmienn±, bo do 'xxx' nie mo¿na, bo jest final
        System.out.println(xxx2.hashCode()+ " ---- 2");

        /*
        Zwróci³o:
        3694080 ---- 1
        3694080 - jeste¶my w metodzie
        xxxx xxxx
        -1117236224 --- znowu w metodzie, ale na koñcu
        -1117236224 ---- 2
         */

        //////////////////////////////////////////// metoda przyjmujaca final string przyjmuje final String :) /////////////////////////////////////////
        System.out.println("\n");
        final String xxx3 = "xxxx3";
        System.out.println(xxx3.hashCode()+ " ---- 1");
        String xxx4 = klasaUtilsowa.robienieCzegosZFinalStringIzwracanie(xxx3);
        System.out.println(xxx4.hashCode()+ " ----- 2 ");

        /*
        Zwróci³o:

        114516531 ---- 1
        114516531 --- jestesmy w metodzie, na poczatku
        114516531 ----- 2
         */
    }
}
