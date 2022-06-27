package refactoringGuru.abstractFactory.factories;

import refactoringGuru.abstractFactory.buttons.Button;
import refactoringGuru.abstractFactory.buttons.WindowsButton;
import refactoringGuru.abstractFactory.checkboxes.Checkbox;
import refactoringGuru.abstractFactory.checkboxes.WindowsChecbkox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */

////////////// konkretna fabryka

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsChecbkox();
    }
}
