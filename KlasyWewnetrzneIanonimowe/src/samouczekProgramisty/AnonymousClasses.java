package samouczekProgramisty;

public class AnonymousClasses {

    public interface GreetingModule {
        void sayHello();
    }

    public static class Robot {
        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething() {
            greetingModule.sayHello();
        }
    }

    public static void main(String[] args) {
        Robot jan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Jan mówi dzieñ dobry!");
            }
        });

        Robot john = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Robot d¿on mówi dzieñ dobry te¿");
            }
        });

        jan.saySomething();
        john.saySomething();
    }
}
