package tutorialspoint_com;

public class car implements vehicle, fourWheeler {
    ///////// pierwszy spos�b, nadpisanie metody i w�asna implementacja
    @Override
    public void print() {
        System.out.println("i am a four wheeler car vehicle!");
    }
}
