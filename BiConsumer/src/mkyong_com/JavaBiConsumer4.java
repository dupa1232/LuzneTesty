package mkyong_com;

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaBiConsumer4 {
    /*
    3. Map.forEach
    In the JDK source code, Map.forEach accepts a BiConsumer as an argument.
     */

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Java");
        map.put(2, "C++");
        map.put(3, "Rust");
        map.put(4, "JavaScript");
        map.put(5, "Go");

        map.forEach((x,y) -> System.out.println(x+ " --- " +y));
    }
}
