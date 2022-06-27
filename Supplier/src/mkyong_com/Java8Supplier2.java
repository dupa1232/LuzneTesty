package mkyong_com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Java8Supplier2<T> {

    // 2. Returns a Supplier

    public static void main(String[] args) {
        Java8Supplier2<String> obj = new Java8Supplier2<>();
        List<String> list = obj.supplier().get();
    }

    public Supplier<List<T>> supplier() {
        return  ArrayList::new;
    }
}
