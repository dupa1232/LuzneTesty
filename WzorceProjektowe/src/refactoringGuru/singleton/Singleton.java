package refactoringGuru.singleton;

public class Singleton {
    private static Singleton instane;
    public String value;

    public Singleton(String value) {
        //Following code emulates slow initialization
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(instane == null) {
            instane = new Singleton(value);
        }
        return instane;
    }
}
