package mkyong_com;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Java8MethodReference4b {
    //4a - Reference to a constructor which accepts an argument ? Invoice(BigDecimal unitPrice)
    public static void main(String[] args) {
        List<BigDecimal> list = Arrays.asList(
                BigDecimal.valueOf(9.99),
                BigDecimal.valueOf(2.99),
                BigDecimal.valueOf(8.99));

        //////////// lambda
        List<Invoice3> invoices = fakeInvoice(list, (price) -> new Invoice3(price));
        invoices.stream().forEach(s-> System.out.println(s.unitPrice));

        //////////// method reference
        List<Invoice3> invoices2 = fakeInvoice(list, Invoice3::new);
        invoices2.forEach(System.out::println);

        /*
        Zwróci, je¶li do³o¿ony jest toString() w Invoice3
        Invoice3{no='null', unitPrice=9.99, qty=null}
        Invoice3{no='null', unitPrice=2.99, qty=null}
        Invoice3{no='null', unitPrice=8.99, qty=null}
         */
    }

    static List<Invoice3> fakeInvoice(List<BigDecimal> list, Function<BigDecimal, Invoice3> func) {
        List<Invoice3> result = new ArrayList<>();

        for(BigDecimal amount : list) {
            result.add(func.apply(amount));
        }

        return result;
    }
}

class Invoice3 {
    String no;
    BigDecimal unitPrice;
    Integer qty;

    public Invoice3(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Invoice3{" +
                "no='" + no + '\'' +
                ", unitPrice=" + unitPrice +
                ", qty=" + qty +
                '}';
    }
}
