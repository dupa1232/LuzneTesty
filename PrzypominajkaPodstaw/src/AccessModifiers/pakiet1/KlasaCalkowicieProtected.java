package AccessModifiers.pakiet1;


// Nie mo¿na zrobiæ klasy protected, przynajmniej w takim wypadku, bo da siê zrobiæ
// prywatn±, statyczn±/niestatyczn±, wewnêtrzn± -- patrz poni¿ej
//protected class KlasaCalkowicieProtected {

//}

public class KlasaCalkowicieProtected {

    protected class KlasaProtectedWKlasaCalkowicieProtected {

    }

    protected static  class  KlasaProtectedStaticWklasaCalkowicieProtected {

    }
}