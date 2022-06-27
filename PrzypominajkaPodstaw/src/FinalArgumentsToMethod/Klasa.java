package FinalArgumentsToMethod;

public class Klasa {

    public void metodaPrzyjmujacaFinalInt(final int wartosc) {
        //wartosc = 1; //// nie mozna tak!!!
    }

    public void metodaPrzyjmujacaFinalString(final String wartosc) {
//        wartosc = new String();/// nie mozna tak!!!
//        wartosc = "ass"; /// nie mozna tak!!!
//        wartosc = null;/// nie mozna tak!!!
    }

    public void metodaPrzyjmujacaFinalStringBuilder(final StringBuilder wartosc) {
//        wartosc = new StringBuilder();/// nie mozna tak!!!
//        wartosc = "ass"; /// tak w ogóle nie mozna, bo do StringBuilder jest proba przypisania stringa
//        wartosc = null;/// nie mozna tak!!!

        /// ale mo¿na tak, czyli zmienic zawartosc obiektu StringBuidler!
        wartosc.append("ass");
    }

    public void metodaPrzyjmujacaStringBuilder(StringBuilder wartosc) {
        wartosc = new StringBuilder("bbb");
        System.out.println("jeste¶my w metodaPrzyjmujacaStringBuilder --- " +wartosc.toString());
    }

    public void metodaPrzyjmujacaStringBuilderZappednPoDrodze(StringBuilder wartosc) {
        wartosc.append(" ----- ");
        System.out.println(wartosc.toString());
        wartosc = new StringBuilder("yyy");
        wartosc.append(" -_-_-_- ");
        System.out.println("jeste¶my w metodaPrzyjmujacaStringBuilderZappednPoDrodze --- " +wartosc.toString());
    }
}
