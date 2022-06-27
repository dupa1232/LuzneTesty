package AccessModifiers.pakiet1;


// Nie mo¿na zrobiæ klasy private, przynajmniej w takim wypadku, bo da siê zrobiæ
// prywatn±, statyczn±/niestatyczn±, wewnêtrzn± -- patrz poni¿ej
//private class KlasaCalkowiciePrivate {
//    void dupa() {
//
//    }
//}

public class KlasaCalkowiciePrivate {

    private class KlasaWewnetrznaPrivate {

    }

    private static class KlasaWewnetrznaStatycznaPrivate {

    }

    public class KlasaNiePrivateWCalkowiciePrivate {
        void metoda() {
            System.out.println("om nom nom");
        }
    }
}