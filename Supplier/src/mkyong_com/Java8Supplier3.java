package mkyong_com;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.function.Supplier;

public class Java8Supplier3 {
    /*
    3. Factory
    3.1 A simple factory method to return a Developer object.
     */

    public static void main(String[] args) {
        Developer obj = factory(Developer::new);
        System.out.println(obj); /// Developer{name='difolt', salary=1, start=2017-04-12}

        Developer obj2 = factory(() -> new Developer("asd"));
        System.out.println(obj2); // Developer{name='asd', salary=1, start=2017-04-12}
    }

    public static Developer factory(Supplier<? extends Developer> s) {
        Developer developer = s.get();
        if(developer.getName() == null || "".equals(developer.getName())) {
            developer.setName("difolt");
        }
        developer.setSalary(BigDecimal.ONE);
        developer.setStart(LocalDate.of(2017, Month.APRIL, 12));

        return developer;
    }
}

class Developer {
    String name;
    BigDecimal salary;
    LocalDate start;

    public Developer() {
    }

    public Developer(String name) {
        this.name = name;
    }

    public Developer(String name, BigDecimal salary, LocalDate start) {
        this.name = name;
        this.salary = salary;
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", start=" + start +
                '}';
    }
}
