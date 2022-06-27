package samouczekProgramisty;

public class ZmienneLokalneKlasaWew {

    public static void main(String[] args) {
        ZmienneLokalneKlasaWew zmienneLokalneKlasaWew = new ZmienneLokalneKlasaWew();
        zmienneLokalneKlasaWew.someMethod();
    }

    ///////////////////////////////////////////////////////////////
    //// U¿ywanie zmiennych lokalnych w klasach wewnêtrznych //////
    ///////////////////////////////////////////////////////////////
    public void someMethod() {
        System.out.println("//// U¿ywanie zmiennych lokalnych w klasach wewnêtrznych //////");
        final String finalVariable = "final variable";
        String effectivelyFinalVariable = "effectively final variable";
        String nonFinalVariable = "non final variable";

        class InnerClass {
            public void saySomething() {
                System.out.println(finalVariable);
                System.out.println(effectivelyFinalVariable);
//                System.out.println(nonFinalVariable); // z racji zmiany ponizej, czyli przypisania "brand new value", niemo¿liwe jest u¿ycie tej zmiennej tu. Jakby
//                tego przypisania poni¿ej nie by³o, to wtedy mo¿na by³oby jej tu u¿yæ w ten sposób
                /*
                W metodzie saySomething() u¿ywamy dwóch zmiennych lokalnych metody otaczaj±cej finalVariable i effectivelyFinalVariable. Jest jednak jedno ograniczenie. Zmienna z ?zewn±trz? u¿yta w klasie wewnêtrznej musi byæ finalna albo ?w³a¶ciwie finalna?.
                Zmienna jest finalna je¶li poprzedza j± s³owo kluczowe final. Kiedy jest ?w³a¶ciwie finalna?? Kiedy nie zmieniamy jej warto¶ci i kompilator za nas wstawia brakuj±ce s³owo final ;).
                W zwi±zku z tym u¿ycie zmiennej nonFinalVariable nie jest dozwolone poniewa¿ jej warto¶æ jest zmieniana.
                 */
            }
        }
        InnerClass instanceOfInnerClass = new InnerClass();
        instanceOfInnerClass.saySomething();
        nonFinalVariable = "brand new value";
    }
}
