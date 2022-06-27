package klasaAbstrRozszerzaAbstr;

public class Abstrakcyjna2 extends Abstrakcyjna1 {
    @Override
    void metodaAbstrakcyjna1() {
        System.out.println("nadpisana i uzupe³niona metodaAbstrakcyjna1() z Abstrakcyjna1 w Abstrakcyjna2");
    }

    /// tê mo¿emy, ale nie musimy nadpisywaæ.
    @Override
    void metodaNieabstrakcyjna1() {
        super.metodaNieabstrakcyjna1();
    }
}
