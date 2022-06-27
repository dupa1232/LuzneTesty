package statycznaKlasaOrazMetoda;

public class Main {
    public static void main(String[] args) {
        StatycznaKlasa statycznaKlasa = new StatycznaKlasa();
        statycznaKlasa.setA(2);

        StatycznaKlasa.StatycznaKlasaWewnetrzna statycznaKlasaWew = new StatycznaKlasa.StatycznaKlasaWewnetrzna();
        statycznaKlasaWew.setB(3);
        System.out.println(statycznaKlasaWew.metodaZeStatycznejKlasyWewnetrznej()); //// 0, bo nie ustawili¶my zewnêtrznego 'b'
        ///// teraz bêdzie lepie:
        StatycznaKlasa.StatycznaKlasaWewnetrzna.setZewB(100);
        System.out.println(statycznaKlasaWew.metodaZeStatycznejKlasyWewnetrznej()); //// 300;

        /* xXxxXxxXxxXxxXxxXxxXxxXxxXxxXxxXx */
        StatycznaKlasa.StatycznaKlasaWewnetrzna.setD(222);
        System.out.println(StatycznaKlasa.StatycznaKlasaWewnetrzna.statycznaMetodaWStatycznejKlasieWewnetrznejDDD()); //// 49284
        /* xXxxXxxXxxXxxXxxXxxXxxXxxXxxXxxXx */
    }
}
