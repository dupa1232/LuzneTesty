package mkyong_com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Java8BiFunction4 {

    //4.1 Filtering a List by some conditions.
    public static void main(String[] args) {
        Java8BiFunction4 obj = new Java8BiFunction4();
        List<String> list = Arrays.asList("nore", "c++", "java", "javascript");
        List<String> result = obj.filterList(list, 3, obj::filterByLength);
        System.out.println(result); ////// [nore, java, javascript]

        ///////////////////////////////////////
        List<String> result1 = obj.filterList(list,3, (x, size) -> {
            if(x.length() > size)
                return x;
            else
                return null;
        });
        System.out.println(result1); ////// [nore, java, javascript]
        ////////////////////////////////////////

        List<String> result2 = obj.filterList(list, "c", (y, condition) -> {
           if(y.startsWith(condition))
               return y;
           else return null;
        });
        System.out.println(result2); ////// [c++]

        //////////////////////////////////////////////
        List<Integer> number = Arrays.asList(1,2,3,4,5);
        List<Integer> result3 = obj.filterList(number,2,(z,condition) -> {
           if(z %2 == 0)
               return z;
           else return null;
        });
        System.out.println(result3); //[2, 4]
    }

    public String filterByLength(String str, Integer size) {
        if(str.length() > size)
            return str;
        else return null;
    }

    public <T,U,R> List<R> filterList(List<T> list1, U condition,
                                      BiFunction<T,U,R> func) {
        List<R> result = new ArrayList<>();
        for(T t : list1) {
            R apply = func.apply(t,condition);
            if(apply != null)
                result.add(apply);
        }
        return result;
    }
}
