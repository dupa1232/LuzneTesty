package samouczekprogramisty;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Zadanie2 {

    public static void main(String[] args) {
        Supplier<Object> objectCreator = Object::new;
        Object objectInstance = objectCreator.get();
        System.out.println(objectInstance);

        BiPredicate<Object, Object> equalsMethodOnClass = Object::equals;
        // same as objectInstance.equals(new Object())
        System.out.println(equalsMethodOnClass.test(objectInstance, new Object()));

        Predicate<Object> equalsMethodOnObject = objectInstance::equals;
        /// same as objectInstance.equals(new Object())
        System.out.println(equalsMethodOnObject.test(new Object()));
    }
    // na podstawie jego rozwi±zañ:
    //https://github.com/SamouczekProgramisty/KursJava/tree/master/28_wyrazenia_lambda/src/main/java/pl/samouczekprogramisty/kursjava/lambdaexpressions/exercise
}


