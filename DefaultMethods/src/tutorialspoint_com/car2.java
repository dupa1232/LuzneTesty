package tutorialspoint_com;

public class car2 implements vehicle, fourWheeler {
    //// drugi spos�b - nadpisanie i wywo�anie z klasy/interfejsu nadrz�dnego
    @Override
    public void print() {
        vehicle.super.print();
    }
}
