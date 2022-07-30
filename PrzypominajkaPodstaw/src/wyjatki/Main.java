package wyjatki;

public class Main {
    public static void main(String[] args) {
        try {
            metoda(-4);
        } catch (MyOwnException ex) {
            System.out.println(ex.getMessage());
            System.out.println("za wyjatkiem");
        }
        System.out.println("dalej dziala");

    }

    static void metoda(int i) throws MyOwnException {
        if(i<-2)
            throw new MyOwnException();
        else
            System.out.println("Everything wokrs fine");
    }
}
