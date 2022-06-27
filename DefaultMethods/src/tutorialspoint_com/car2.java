package tutorialspoint_com;

public class car2 implements vehicle, fourWheeler {
    //// drugi sposób - nadpisanie i wywo³anie z klasy/interfejsu nadrzêdnego
    @Override
    public void print() {
        vehicle.super.print();
    }
}
