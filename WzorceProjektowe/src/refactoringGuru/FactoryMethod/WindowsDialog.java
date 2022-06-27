package refactoringGuru.FactoryMethod;

/**
 * Windows Dialog will produce Windows buttons.
 */

///////////////// kolejny konkretny tw�rca
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
