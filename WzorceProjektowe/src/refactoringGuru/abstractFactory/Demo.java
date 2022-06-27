package refactoringGuru.abstractFactory;


import refactoringGuru.abstractFactory.app.Application;
import refactoringGuru.abstractFactory.factories.GUIFactory;
import refactoringGuru.abstractFactory.factories.MacOSFactory;
import refactoringGuru.abstractFactory.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */

public class Demo {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if("mac".equals(osName)) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }


    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
