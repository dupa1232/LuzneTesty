package statycznaKlasaOrazMetoda;

public /*static*/ class StatycznaKlasa { /// tak nie mo¿emy, tu mo¿e byæ tylko: public, abstract, final

    private int a;
    private static int b;

    //////// ale mo¿emy zrobiæ statyczn± klasê wewnêtrzn±
    static class StatycznaKlasaWewnetrzna {
        private int b;
        private static int d;

        int metodaZeStatycznejKlasyWewnetrznej() {
            StatycznaKlasa statycznaKlasa = new StatycznaKlasa();
//            return  statycznaKlasa.a; /// takie wywolanie jest OK!
//            return a*a; /// je¶li pole 'a' nie jest statyczne, to narzeka, ¿e "non-static field cannot be referenced from a static context"
//            return this.b*b; /// w obu przypadkach, bierze b z klasy wewnetrznej
            return b*StatycznaKlasa.b; /// wewnetrzne b * zewnetrzne b;
        }

        static int statycznaMetodaWStatycznejKlasieWewnetrznej() {
            StatycznaKlasa statycznaKlasa = new StatycznaKlasa();
//            return  statycznaKlasa.a; /// takie wywolanie jest OK!
//            return a*a; /// je¶li pole 'a' nie jest statyczne, to narzeka, ¿e "non-static field cannot be referenced from a static context"
//            return this.b*b; /// tak nie mozna, bo narzeka, ¿e nie mo¿na "from static context"
//            return b*b; /// tak nie mozna, bo narzeka, ¿e nie mo¿na "from static context"
//            return d*d; //// tak jest OK; czyli zmienna musia³a byæ static;
            return StatycznaKlasa.b * StatycznaKlasa.b; /// tak te¿ jest OK, czyli zmienna jest static;
        }

        static int statycznaMetodaWStatycznejKlasieWewnetrznejDDD() {
            return StatycznaKlasaWewnetrzna.d * StatycznaKlasaWewnetrzna.d; /// tak te¿ jest OK, czyli zmienna jest static;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public static int getD() {
            return d;
        }

        public static void setD(int d) {
            StatycznaKlasaWewnetrzna.d = d;
        }

        public static void setZewB(int bbb) {
            StatycznaKlasa.b = bbb;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
