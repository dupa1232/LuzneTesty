package refactoringGuru.abstractFactory.factories;

import refactoringGuru.abstractFactory.buttons.Button;
import refactoringGuru.abstractFactory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */

//////// Fabryka abstrakcyjna

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
