package kilkaSzczebliDziedziczenia;

public class Main {
    public static void main(String[] args) {
        KlasaA klasaA = new KlasaC();
        klasaA.metodaA(); /// przenosi do KlasaA, ale drukuje wersjê z KlasaC!!!!, czyli drukuje "super" i "override"
        klasaA.metodaAAAAAA(); /// przenosi do KlasaA
        System.out.println();

        KlasaC klasaC = new KlasaC();
        klasaC.metodaA(); /// przenosi do KlasaC, czyli drukuje "super" i "override"
        klasaC.metodaAAAAAA(); /// przenosi do KlasaA
        System.out.println();

        KlasaA klasaA1 = new KlasaA();
        klasaA1.metodaA(); /// przenosi do KlasaA i tamt± wersjê drukuje
        klasaA1.metodaAAAAAA(); /// przenosi do KlasaA i tamt± wersjê drukuje
        /**
         Zwróci:
         Jestemy w metodzie A
         Dopisany szit po super.
         Jeste¶my w metodzie AAAAAAAA

         Jestemy w metodzie A
         Dopisany szit po super.
         Jeste¶my w metodzie AAAAAAAA

         Jestemy w metodzie A
         Jeste¶my w metodzie AAAAAAAA
         */
    }
}
