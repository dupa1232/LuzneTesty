package mkyong_com;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Java8MethodReference4a {

    /*
    4 Reference to a default constructor.
    ClassName::new
     */

    public static void main(String[] args) {

        /////////////////// lambda
        Supplier<Map> obj1 = () -> new HashMap();
        Map map1 = obj1.get();
        /////////////////// method reference
        Supplier<Map> obj2 = HashMap::new;
        Map map2 = obj2.get();


        /////////////////// lambda
        Supplier<Invoice2> obj3 = () -> new Invoice2(); //// default Invoice Constructor
        Invoice2 invoice3 = obj3.get();
        /////////////////// method reference
        Supplier<Invoice2> obj4 = Invoice2::new;
        Invoice2 invoice4 = obj4.get();
    }
}

class Invoice2 {
    String no;
    BigDecimal unitPrice;
    Integer qty;

    public Invoice2() {}

    public Invoice2(String no, BigDecimal unitPrice, Integer qty) {
        this.no = no;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    public String getNo() {
        return no;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public Integer getQty() {
        return qty;
    }
}
