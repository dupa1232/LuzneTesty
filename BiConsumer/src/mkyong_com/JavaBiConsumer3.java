package mkyong_com;

import java.util.function.BiConsumer;

public class JavaBiConsumer3 {

    //2.2 More BiConsumer examples.
    public static void main(String[] args) {
        math(1,2, (x,y) -> System.out.println(x+y));
        math(4,2, (x,y) -> System.out.println(x-y));
        math(2,5, (x,y) -> System.out.println(x*y));
        math(6,3, (x,y) -> System.out.println(x/y));
    }

    static <Integer> void math(Integer i1, Integer i2, BiConsumer<Integer, Integer> c) {
        c.accept(i1,i2);
    }
}
