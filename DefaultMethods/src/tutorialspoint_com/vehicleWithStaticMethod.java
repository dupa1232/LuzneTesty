package tutorialspoint_com;

public interface vehicleWithStaticMethod {
    default void print() {
       System.out.println("I am a vehicleWithStaticMethod!");
    }

    default void print2() {
        System.out.println("i am vehicleWithStaticMethod - print2()");
    }
    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }

}
