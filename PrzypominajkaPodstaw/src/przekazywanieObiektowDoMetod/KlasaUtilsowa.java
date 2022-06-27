package przekazywanieObiektowDoMetod;

import java.util.ArrayList;
import java.util.List;

public class KlasaUtilsowa {

    public void robienieCzegosZlist(List<Integer> list) {
        System.out.println(list.hashCode() + "   --- hashCode() robienieCzegosZlist() - KlasaUtilsowa");
        /// to tez sprawdzac, jak ma sie ten hashCode() do tego z miejsca wywo³ania!
        list.add(666);
    }

    public List<Integer> metodaZwracajacaListe() {
        List<Integer> lista = new ArrayList<>();
        System.out.println(lista.hashCode() + " --- hashCode() w metodaZwracajacaListe() z KlasaUtilsowa.");
        lista.add(9);
        lista.add(8);
        return lista;
    }

    public List<Integer> robienieCzegosZmapaPrzyjmujacaFinalList(final List<Integer> list) {
        System.out.println(list.hashCode()+ " ---- robienieCzegosZmapaPrzyjmujacaFinalList() - hashCode - KlasaUtilsowa");
        list.add(111111);
        System.out.print("lista po dodaniu 11111111 ---- ");
        list.stream().forEach(x -> System.out.print(x+ " ; "));
        System.out.println();
        return  list;
    }

    public List<Integer> robienieCzegosZmapaPrzyjmujacaFinalListMetodaKtoraZwracaList(final List<Integer> list) {
        System.out.println(list.hashCode()+ " ---- robienieCzegosZmapaPrzyjmujacaFinalListMetodaKtoraZwracaList() - hashCode - KlasaUtilsowa");
        list.add(111111);
        System.out.print("lista po dodaniu 11111111: ");
        list.stream().forEach(x -> System.out.print(x+ " ; "));
        System.out.println();
        return list;
    }

    public void robienieCzegosZeString(String string) {
        System.out.println(string.hashCode() + " - jeste¶my w metodzie");
        string += " xxxx ";
        System.out.println(string);
        System.out.println(string.hashCode()+ " --- znowu w metodzie, ale na koñcu");
    }

    public String robienieCzegosZeStringIzwracanie(String string) {
        System.out.println(string.hashCode() + " - jeste¶my w metodzie");
        string += " xxxx ";
        System.out.println(string);
        System.out.println(string.hashCode()+ " --- znowu w metodzie, ale na koñcu");
        return string;
    }

    public void robienieCzegosZFinalString(final String string) {
        System.out.println(string.hashCode() + " --- jestesmy w metodzie, na poczatku");
//        string = "zxc"; ///// nie mozna, bo jest final!

    }

    public String robienieCzegosZFinalStringIzwracanie(final String string) {
        System.out.println(string.hashCode() + " --- jestesmy w metodzie, na poczatku");
//        string = "zxc"; ///// nie mozna, bo jest final!
        return string;

    }

    //////////////
    public void robienieCzegosZeStringBuilder(StringBuilder stringB) {
        System.out.println(stringB.hashCode() + " --- jestesmy w metodzie robienieCzegosZeStringBuilder()");
        stringB.append(" -x-x-x-x");
        System.out.println(stringB.hashCode() + " --- jestesmy w metodzie robienieCzegosZeStringBuilder() znowu");
    }

    public void robienieCzegosZeStringBuilderFinal(final StringBuilder stringBuilder) {
        stringBuilder.append("dodajê co¶ do SB");
        System.out.println(stringBuilder.toString() + " ------ ");
        System.out.println(stringBuilder.hashCode() + "  - haszkod xxxx ");
//        stringBuilder = new StringBuilder("zzz"); //// nie mo¿na, bo jest final!
    }

    public StringBuilder robienieCzegosZeStringBuilderIzwracanieSB(StringBuilder stringBuilder) {
        stringBuilder.append(" ---x-x-x-x-x- -- dodajê co¶ do SB");
        System.out.println(stringBuilder.toString() + " --xxxxxxxx---- ");
        System.out.println(stringBuilder.hashCode() + "  - haszkod yyyyyyyy ");
        return stringBuilder;
    }

    public StringBuilder robienieCzegosZfinalStringBuilderIzwracanieSB(final StringBuilder stringBuilder) {
        stringBuilder.append(" === dodajê co¶ do SB");
        System.out.println(stringBuilder.toString() + " 2222 ------ ");
        System.out.println(stringBuilder.hashCode() + "  - 1111 haszkod xxxx ");
//        stringBuilder = new StringBuilder("zzz"); //// nie mo¿na, bo jest final!
        return stringBuilder;
    }

    public StringBuilder robienieCzegosZeStringBuilderIzwracanieSB22222(StringBuilder stringBuilder) {
        stringBuilder.append(" --ccccc -- dodajê co¶ do SB");
        System.out.println(stringBuilder.toString() + " --cccccc---- ");
        System.out.println(stringBuilder.hashCode() + "  - haszkod ddddddd ");
        stringBuilder = new StringBuilder("nowy SB!");
        return stringBuilder;
    }

    public void robienieCzegosZint(int integer) {
        integer = integer + 10;
        System.out.println(integer + " ===== wynik");
    }

    public void robienieCzegosZintFinal(final int integer) {
//        integer = 5;// nie mozna, bo final
        System.out.println(integer +4 +" wynik dupa");
    }

    public int robienieCzegosZintOrazZwracanieInt(int integer) {
        integer = integer + 10;
        System.out.println(integer + " ===== wynik");
        return integer;
    }

    public void robienieCzegosZInteger(Integer integer) {
        integer = integer + 100;
        System.out.println(integer.hashCode() + " - haszkod, ale w KlasaUtilsowa");
        System.out.println(integer + " --- wartosc KlasaUtilsowa - du¿y Integer, ale w KlasaUtilsowa");
    }

    public void robienieCzegosZIntegerFinal(final Integer integer) {
//        integer = 20; /// nie mozna, bo final
        System.out.println(integer.hashCode() + " - haszkod, ale w KlasaUtilsowa przyjmujaca final zmienna");
        System.out.println(integer + " --- wartosc KlasaUtilsowa - du¿y Integer, ale w KlasaUtilsowa przyjmujaca final zmienna");
    }

    public Integer zwracanieIntegerZmetodyPrzyjmujacejInteger(Integer ass) {
        System.out.println(ass.hashCode() + " -- haszkod --- w metodzie1 ");
        ass = ass + 22;
        System.out.println(ass.hashCode() + " -- haszkod --- w metodzie2 ");
        return ass;
    }



    public void robienieCzegosZDouble(Double doublee) {
        doublee = doublee + 100;
        System.out.println(doublee.hashCode() + " - haszkod, ale w KlasaUtilsowa");
        System.out.println(doublee + " --- wartosc KlasaUtilsowa - du¿y Double, ale w KlasaUtilsowa");
    }

    public void robienieCzegosZDoubleFinal(final Double doublee) {
//        integer = 20; /// nie mozna, bo final
        System.out.println(doublee.hashCode() + " - haszkod, ale w KlasaUtilsowa przyjmujaca final zmienna");
        System.out.println(doublee + " --- wartosc KlasaUtilsowa - du¿y Double, ale w KlasaUtilsowa przyjmujaca final zmienna");
    }

    public Double zwracanieDoubleZmetodyPrzyjmujacejDouble(Double ass) {
        System.out.println(ass.hashCode() + " -- haszkod --- w metodzie1 ");
        ass = ass + 22;
        System.out.println(ass.hashCode() + " -- haszkod --- w metodzie2 ");
        return ass;
    }

}
