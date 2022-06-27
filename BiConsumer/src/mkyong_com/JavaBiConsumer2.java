package mkyong_com;

import java.util.function.BiConsumer;

public class JavaBiConsumer2 {

    /*
    2. Higher Order Function
    2.1 This example accepts BiConsumer as an argument, create a generic addTwo to join two objects.
     */
    public static void main(String[] args) {
        addTwo(1,2, (x,y) -> System.out.println(x+y)); /// 3
        addTwo("java", "script", (c,v) -> System.out.println(c+v)); /// javascript
    }

    static <T> void addTwo(T a1, T a2, BiConsumer<T, T> consumer) {
        consumer.accept(a1,a2);
    }
}
