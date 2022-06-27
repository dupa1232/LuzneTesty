package mkyong_com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Java8Function4 {


    /// This example accepts Function as an argument, convert a List of String into another List of String, which was hashed with SHA256.
    public static void main(String[] args) {
        Java8Function4 obj = new Java8Function4();
        List<String> list = Arrays.asList("node", "c++", "java", "javascript");

        //lambda
        List<String> result = obj.map(list, s -> obj.sha256(s));
        result.forEach(System.out::println);
        /*
        node2
        c++2
        java2
        javascript2
         */

        //// method reference
        List<String> result2 = obj.map(list, obj::sha256);
        result2.forEach(System.out::println);
        /*
        node2
        c++2
        java2
        javascript2
         */
    }

    public <T,R> List<R> map(List<T> list, Function<T,R> func) {
        List<R> result = new ArrayList<>();

        for(T t : list) {
            result.add(func.apply(t));
        }

        return result;
    }

    public String sha256(String str) {
        //return DigestUtils.sha256Hex(str); /// tu powinno byæ to, ale nie chcia³o mi siê jarki pobieraæ
        return str+"2";
    }
}
