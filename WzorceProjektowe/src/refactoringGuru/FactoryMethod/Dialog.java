package refactoringGuru.FactoryMethod;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */

/////////////// Bazowy twórca ///////////////////

public abstract class Dialog {
    public void renderWindow() {
        /// jaki¶ inny kod

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
