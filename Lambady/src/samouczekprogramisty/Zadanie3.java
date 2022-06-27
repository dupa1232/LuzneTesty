package samouczekprogramisty;

import java.util.function.BiFunction;

public class Zadanie3 {
    public static void main(String[] args) {
        BiFunction<Integer, String, Zadanie3Human> humanConstructor = Zadanie3Human::new;
        Zadanie3Human zadanie3Human = humanConstructor.apply(10, "zdzich");
        System.out.println(zadanie3Human.getAge());
        System.out.println(zadanie3Human.getName());
    }

    // w oparciu o jego rozwi±zania
    // https://github.com/SamouczekProgramisty/KursJava/tree/master/28_wyrazenia_lambda/src/main/java/pl/samouczekprogramisty/kursjava/lambdaexpressions/exercise
}
