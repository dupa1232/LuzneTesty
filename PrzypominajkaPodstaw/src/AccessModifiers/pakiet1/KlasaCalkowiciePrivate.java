package AccessModifiers.pakiet1;


// Nie mo�na zrobi� klasy private, przynajmniej w takim wypadku, bo da si� zrobi�
// prywatn�, statyczn�/niestatyczn�, wewn�trzn� -- patrz poni�ej
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