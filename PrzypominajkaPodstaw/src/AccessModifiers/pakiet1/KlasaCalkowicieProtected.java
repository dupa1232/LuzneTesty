package AccessModifiers.pakiet1;


// Nie mo�na zrobi� klasy protected, przynajmniej w takim wypadku, bo da si� zrobi�
// prywatn�, statyczn�/niestatyczn�, wewn�trzn� -- patrz poni�ej
//protected class KlasaCalkowicieProtected {

//}

public class KlasaCalkowicieProtected {

    protected class KlasaProtectedWKlasaCalkowicieProtected {

    }

    protected static  class  KlasaProtectedStaticWklasaCalkowicieProtected {

    }
}