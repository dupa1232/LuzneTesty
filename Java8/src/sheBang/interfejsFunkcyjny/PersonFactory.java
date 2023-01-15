package sheBang.interfejsFunkcyjny;

@FunctionalInterface
public interface PersonFactory<P extends Perosn> {
    P create(String firstName, String lastName);
}
