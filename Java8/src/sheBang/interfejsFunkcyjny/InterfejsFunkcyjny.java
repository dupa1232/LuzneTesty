package sheBang.interfejsFunkcyjny;

@FunctionalInterface
public interface InterfejsFunkcyjny<F, T> {
    T convert(F from);

    default String doingSthDifferent() {
        return "HI bitches, I am default method from Functional Interface!";
    }
}
