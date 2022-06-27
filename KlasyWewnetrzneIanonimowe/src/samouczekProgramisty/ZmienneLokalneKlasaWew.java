package samouczekProgramisty;

public class ZmienneLokalneKlasaWew {

    public static void main(String[] args) {
        ZmienneLokalneKlasaWew zmienneLokalneKlasaWew = new ZmienneLokalneKlasaWew();
        zmienneLokalneKlasaWew.someMethod();
    }

    ///////////////////////////////////////////////////////////////
    //// U�ywanie zmiennych lokalnych w klasach wewn�trznych //////
    ///////////////////////////////////////////////////////////////
    public void someMethod() {
        System.out.println("//// U�ywanie zmiennych lokalnych w klasach wewn�trznych //////");
        final String finalVariable = "final variable";
        String effectivelyFinalVariable = "effectively final variable";
        String nonFinalVariable = "non final variable";

        class InnerClass {
            public void saySomething() {
                System.out.println(finalVariable);
                System.out.println(effectivelyFinalVariable);
//                System.out.println(nonFinalVariable); // z racji zmiany ponizej, czyli przypisania "brand new value", niemo�liwe jest u�ycie tej zmiennej tu. Jakby
//                tego przypisania poni�ej nie by�o, to wtedy mo�na by�oby jej tu u�y� w ten spos�b
                /*
                W metodzie saySomething() u�ywamy dw�ch zmiennych lokalnych metody otaczaj�cej finalVariable i effectivelyFinalVariable. Jest jednak jedno ograniczenie. Zmienna z ?zewn�trz? u�yta w klasie wewn�trznej musi by� finalna albo ?w�a�ciwie finalna?.
                Zmienna jest finalna je�li poprzedza j� s�owo kluczowe final. Kiedy jest ?w�a�ciwie finalna?? Kiedy nie zmieniamy jej warto�ci i kompilator za nas wstawia brakuj�ce s�owo final ;).
                W zwi�zku z tym u�ycie zmiennej nonFinalVariable nie jest dozwolone poniewa� jej warto�� jest zmieniana.
                 */
            }
        }
        InnerClass instanceOfInnerClass = new InnerClass();
        instanceOfInnerClass.saySomething();
        nonFinalVariable = "brand new value";
    }
}
