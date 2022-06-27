package mkyong_com;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BiFunction;

public class Java8MethodReference3b {

    public static void main(String[] args) {
        Invoice obj = new Invoice("A001", BigDecimal.valueOf(1.99), 3);
        InvoiceCalculator formula = new InvoiceCalculator();

        /////////////// lambda
        BigDecimal result = calculate(formula, obj, (f,o) -> f.normal(o));
        System.out.println(result);
        /////////////// method reference
        BigDecimal result2 = calculate(formula, obj, InvoiceCalculator::normal);
        System.out.println(result2);


        /////////////// lambda
        BigDecimal result3 = calculate(formula, obj, (f,o) -> f.promotion(o));
        System.out.println(result3);
        /////////////// method reference
        BigDecimal result4 = calculate(formula, obj, InvoiceCalculator::promotion);
        System.out.println(result4);
        

    }

    static BigDecimal calculate(InvoiceCalculator formula, Invoice s1, BiFunction<InvoiceCalculator, Invoice, BigDecimal> func) {
        return func.apply(formula, s1);
    }
}

class InvoiceCalculator {

    public BigDecimal normal(Invoice obj) {
        return obj.getUnitPrice().multiply(BigDecimal.valueOf(obj.qty));
    }

    public BigDecimal promotion(Invoice obj) {
        return obj.getUnitPrice().multiply(BigDecimal.valueOf(obj.qty))
                .multiply(BigDecimal.valueOf(0.9))
                .setScale(2, RoundingMode.HALF_UP);
    }
}

class Invoice {
    String no;
    BigDecimal unitPrice;
    Integer qty;

    public Invoice(String no, BigDecimal unitPrice, Integer qty) {
        this.no = no;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
