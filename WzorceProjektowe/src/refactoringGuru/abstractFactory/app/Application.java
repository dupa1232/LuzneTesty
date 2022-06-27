package refactoringGuru.abstractFactory.app;

import refactoringGuru.abstractFactory.buttons.Button;
import refactoringGuru.abstractFactory.checkboxes.Checkbox;
import refactoringGuru.abstractFactory.factories.GUIFactory;


/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */

//////// kod klienta
public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
