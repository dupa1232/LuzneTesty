package sheBang.metodyDomyslneInterfejsow;

public interface Interfejs {

    public int sum(int a, int b);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
