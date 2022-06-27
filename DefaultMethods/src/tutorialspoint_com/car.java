package tutorialspoint_com;

public class car implements vehicle, fourWheeler {
    ///////// pierwszy sposób, nadpisanie metody i w³asna implementacja
    @Override
    public void print() {
        System.out.println("i am a four wheeler car vehicle!");
    }
}
