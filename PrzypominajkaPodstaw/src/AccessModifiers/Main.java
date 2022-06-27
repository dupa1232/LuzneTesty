package AccessModifiers;

import AccessModifiers.pakiet1.*;
import AccessModifiers.pakiet2.KlasaProtected3;

public class Main {
    public static void main(String[] args) {
        ////////////////////////////////////////////////// DEFAULT - access modifier ------------
        //KlasaPackage1 klasaPackage1 = new KlasaPackage1(); //// nie mo¿na, bo jest w innym pakiecie!
        KlasaPackage2 klasaPackage2 = new KlasaPackage2();
        klasaPackage2.metodaNiePackage2(); /// jest do niej dostêp, bo jest public
//        klasaPackage2.metodaPackage2(); /// nie ma do niej dostêpu, bo jest "default"

        //// do metody z KlasaPackage1 - metoda() te¿ nie mamy dostêpu pomimo tego, ¿e KlasaPackage2 dziedziczy po KlasaPackage1!!!
//        klasaPackage2.metoda();

        ////////////////////////////////////////////////// PUBLIC - access modifier ------------
        //// czyli zawsze i wszêdzie mamy dostêp do takich zasobów - szkoda robiæ przyk³ady :)

        ////////////////////////////////////////////////// PRIVATE - access modifier ------------
        /// dostêp do zasobów tylko z poziomu klasy, w której jest zdefiniowane. Oczywi¶cie, da siê do nich dostaæ - patrz zmienne prywatne i gettery, settery, które umo¿liwiaj± dostêp
        /// do nich
        KlasaPrivate1 klasaPrivate1 = new KlasaPrivate1();
        klasaPrivate1.metodaNiePrivate1();
//        klasaPrivate1.metodaPrivate1(); /// /nie mamy dostêpu, bo jest private

        KlasaCalkowiciePrivate klasaCalkowiciePrivate = new KlasaCalkowiciePrivate();
        KlasaCalkowiciePrivate.KlasaNiePrivateWCalkowiciePrivate klasaNiePrivateWCalkowiciePrivate = new KlasaCalkowiciePrivate().new KlasaNiePrivateWCalkowiciePrivate();
        //KlasaCalkowiciePrivate. /// do tych private oczywi¶cie nie mamy dostêpu.
//        KlasaCalkowiciePrivate.KlasaWewnetrznaStatycznaPrivate klasaWewnetrznaStatycznaPrivate = new KlasaCalkowiciePrivate.KlasaWewnetrznaStatycznaPrivate(); // tak te¿ nie ma dostêpu

        ////////////////////////////////////////////////// PROTECTED - access modifier ----------
        KlasaProtected1 klasaProtected1 = new KlasaProtected1();
//        klasaProtected1.metodaProtected1(); /// nie mamy dostêpu!
        klasaProtected1.metodaPublicDlaKlasaProtected1();
        KlasaProtected2 klasaProtected2 = new KlasaProtected2();
//        klasaProtected2.metodaProtected1();  /// nie mamy dostêpu!
        KlasaProtected3 klasaProtected3 = new KlasaProtected3();
//        klasaProtected3.metodaProtected1(); /// nie mamy dostêpu!
        klasaProtected3.metodaPublicDlaKlasaProtected1();

//        KlasaCalkowicieProtected.KlasaProtectedWKlasaCalkowicieProtected klasaProtectedWKlasaCalkowicieProtected = new KlasaCalkowicieProtected().new KlasaProtectedWKlasaCalkowicieProtected(); /// tak nie ma dostêpu do tej klasy
//        KlasaCalkowicieProtected.KlasaProtectedStaticWklasaCalkowicieProtected klasaProtectedStaticWklasaCalkowicieProtected = new KlasaCalkowicieProtected.KlasaProtectedStaticWklasaCalkowicieProtected(); /// tak nie ma dostêpu do tej klasy
    }
}
