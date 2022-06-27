package interfejsIprzekazywanieObiektow;

public class Main {
    public static void main(String[] args) {

        WykonywczDzialan wykonywczDzialan = new WykonywczDzialan();
//        Kalkulator dodawanie = new DodawanieKlasa();
//        dodawanie.set
        //// tak jak te dwie linijki wy�ej, nie mozna! trzeba tak jak ponizej:
        DodawanieKlasa dodawanie = new DodawanieKlasa();
        dodawanie.setA(2);
        dodawanie.setB(3);
        System.out.println(wykonywczDzialan.zwrocWynikDodawania(dodawanie)); ///

        try {
            System.out.println(wykonywczDzialan.zwrocWynikMnozenia(dodawanie)); /// w tym przypadku, czyli jak
            // damy tylko t� linijke, bez try catch, czyli obslugi wyjatku, program przerwie na tej linii dzialanie
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }


        OdejmowanieKlasa odejmowanie = new OdejmowanieKlasa();
        odejmowanie.setA(23);
        odejmowanie.setB(22);
        System.out.println(wykonywczDzialan.zwrocWynikOdejmowania(odejmowanie));
    }

    /*
    Zwr�ci:
    5
    1
    oraz wyjatek, ale on b�dzie zwr�cony w r�nym miejscu, a przynajmniej tak by�o, jak odpala�em klas� kilka razy :)

     */
}
