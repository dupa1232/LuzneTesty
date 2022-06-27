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
    to zwróci co¶ w stylu:
    i`m doing sth useful!
    class samouczekProgramisty.AnonymousCheating$1

    gdzie 1, znajduj±ce siê po $, to nazwa klasy wewnêtrznej, która zosta³a umieszczona w klasie AnonymousCheating.java

     */
}
