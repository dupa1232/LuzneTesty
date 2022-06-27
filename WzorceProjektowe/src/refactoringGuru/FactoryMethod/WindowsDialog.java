package refactoringGuru.FactoryMethod;

/**
 * Windows Dialog will produce Windows buttons.
 */

///////////////// kolejny konkretny twórca
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
