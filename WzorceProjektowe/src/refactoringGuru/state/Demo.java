package refactoringGuru.state;

import refactoringGuru.state.ui.Player;
import refactoringGuru.state.ui.UI;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
