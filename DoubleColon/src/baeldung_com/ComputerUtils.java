package baeldung_com;

public class ComputerUtils {

    static void repair(final Computer computer) {
        if(computer.getHealty() < 50)
            computer.setHealty(100);
    }
}
