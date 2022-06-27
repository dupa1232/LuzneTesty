package refactoringGuru.abstractFactory.checkboxes;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkbox.
 */
public class WindowsChecbkox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox");
    }
}
