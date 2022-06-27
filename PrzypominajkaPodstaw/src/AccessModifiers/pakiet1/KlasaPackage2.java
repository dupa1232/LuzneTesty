package AccessModifiers.pakiet1;

public class KlasaPackage2 extends  KlasaPackage1{
    void metodaPackage2() {
        System.out.println("metodaPackage2 ----------------");
    }

    public void metodaNiePackage2() {
        System.out.println("metodaNiePackage2 ------------");
    }

    @Override
    void metoda() {
        super.metoda();
    }
}
