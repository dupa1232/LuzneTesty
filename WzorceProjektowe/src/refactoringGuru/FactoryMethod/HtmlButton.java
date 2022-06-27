package refactoringGuru.FactoryMethod;

/*
    Html button implementation.
 */

//////// Konkretny tw�rca
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello world'");
    }
}
