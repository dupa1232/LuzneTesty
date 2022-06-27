package mkyong_com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class Java8Supplier1 {

    //1. Supplier
    //1.1 This example uses Supplier to return a current date-time.

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {

        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();
        System.out.println(time); /// 2022-03-27T13:06:17.115182900

        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
        String time2 = s1.get();
        System.out.println(time2); //// 2022-03-27 13:06:17
    }
}
