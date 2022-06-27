package tutorialspoint_com;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        /// with type declaration
        MathOperaion addition = (int a, int b) -> a+b;

        /// without type operatiob
        MathOperaion subtraction = (a, b) -> a-b;

        // with return statement in curly brackets
        MathOperaion multiplication = (int a, int b) -> {return a*b;};

        /// without return statement and without curly brackets
        MathOperaion division = (int a, int b) -> a/b;

        System.out.println("10 + 2 = " +main.operate(10,2, addition));
        System.out.println("8 - 3 = " +main.operate(8,3, subtraction));
        System.out.println("3 * 2 = " +main.operate(3,2,multiplication));
        System.out.println("10 / 2 = " +main.operate(10,2, division));

        //////// without parenthesis
        GreetingService greetingService = message -> System.out.println("Hello " +message);
        // with parenthesis
        GreetingService greetingService1 = (message) -> System.out.println("Hello with parenthesis " +message);

        greetingService.sayMessage("world without parenthesis");
        greetingService1.sayMessage(" bicz");

        greetingService = message -> System.out.println("hejlo³ " +message);
        greetingService.sayMessage("maj frend");
    }

    interface MathOperaion {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperaion mathOperaion) {
        return mathOperaion.operation(a, b);
    }
}