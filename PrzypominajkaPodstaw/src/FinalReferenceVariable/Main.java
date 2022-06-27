package FinalReferenceVariable;

public class Main {

    /// If we have a final reference variable, we can?t reassign it either. But this doesn?t mean that the object it
    // refers to is immutable. We can change the properties of this object freely.
    // Zmienna final powinna byæ pisana "upper case", gdzie spacje s± pod³ogami -> _
    // Zmienna final musi byc zainicjalizowana w czasie deklaracji, albo najpozniej w konstruktorze
    public static void main(String[] args) {
        final Cat cat = new Cat();

//        cat = new Cat(); //// nie mozna!!!!!!!!!!, skoro zmienna jest final

        System.out.println(cat.getWeight()); /// 0

        /// ale mozna zmienic stan istniejacego obiektu!!!!
        cat.setWeight(2);
        System.out.println(cat.getWeight()); /// 2
    }
}
