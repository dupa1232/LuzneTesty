package samouczekProgramisty;

public class AnonymousCheating {
    private interface SomeInterface {
        void doSomethingUseful();
    }

    public static void main(String[] args) {
        SomeInterface anonymousInterface = new SomeInterface() {
            @Override
            public void doSomethingUseful() {
                System.out.println("i`m doing sth useful!");
            }
        };

        anonymousInterface.doSomethingUseful();
        System.out.println(anonymousInterface.getClass());
    }

    /*
    to zwr�ci co� w stylu:
    i`m doing sth useful!
    class samouczekProgramisty.AnonymousCheating$1

    gdzie 1, znajduj�ce si� po $, to nazwa klasy wewn�trznej, kt�ra zosta�a umieszczona w klasie AnonymousCheating.java

     */
}
