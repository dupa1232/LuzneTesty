package tutorialspoint_com;

public interface vehicle {
    default void print() {
        System.out.println("i am a vehicle");
    }

}
