package refactoringGuru.abstractFactory.factories;

import refactoringGuru.abstractFactory.buttons.Button;
import refactoringGuru.abstractFactory.buttons.MacOSButton;
import refactoringGuru.abstractFactory.checkboxes.Checkbox;
import refactoringGuru.abstractFactory.checkboxes.MacOSCheckbox;


/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */

//////////////// konkretna fabryka
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
