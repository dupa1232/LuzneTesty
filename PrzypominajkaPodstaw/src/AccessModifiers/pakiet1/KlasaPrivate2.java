package AccessModifiers.pakiet1;

public class KlasaPrivate2 extends KlasaPrivate1{
//    metodaPrivate1(); // nie mamy do niej dost�pu, bo jest private!

    @Override
    public void metodaNiePrivate1() {
        super.metodaNiePrivate1();
    }
}
