package mkyong_com;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8MethodReference2 {

    public static void main(String[] args) {

        /*
        This example sorts a list of Employee by salary. We can reference to an instance method compareBySalary of a particular object ComparatorProvider.
         */

        List<Employee> list = Arrays.asList(
                new Employee("mkyong", 38, BigDecimal.valueOf(3800)),
                new Employee("zilap", 5, BigDecimal.valueOf(100)),
                new Employee("ali", 25, BigDecimal.valueOf(2500)),
                new Employee("unknown", 99, BigDecimal.valueOf(9999)));
        ComparatorProvider provider = new ComparatorProvider();
        ////////////////////////////////////////////////////////////////////////anonymous class
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return provider.compareBySalary(o1,o2);
            }
        });
        list.stream().forEach(s-> System.out.println(s.getSalary())); /// ciekawe - wywo³anie w sposób Employee::getSalary nie wy¶wietla³o ¿adnego b³êdu, ale po odpaleniu nic nie wy¶wietla³o

        /////////////////////////////////////////////////////////////////////// lambady
        List<Employee> list2 = Arrays.asList(
                new Employee("mkyong", 38, BigDecimal.valueOf(3800)),
                new Employee("zilap", 5, BigDecimal.valueOf(100)),
                new Employee("ali", 25, BigDecimal.valueOf(2500)),
                new Employee("unknown", 99, BigDecimal.valueOf(9999)));
        list2.sort((Employee o1, Employee o2) -> provider.compareByName(o1,o2));
        list2.stream().forEach(x-> System.out.println(x.getName()));


        /////////////////////////////////////////////////////////////////////// method reference
        list2.sort(provider::compareByAge);
        list2.stream().forEach(x-> System.out.println(x.getAge()));
    }
}

class ComparatorProvider {
    public int compareByAge(Employee o1, Employee o2) {
        return o1.getAge().compareTo(o2.getAge());
    }

    public int compareByName(Employee o1, Employee o2) {
        return  o1.getName().compareTo(o2.getName());
    }

    public int compareBySalary(Employee o1, Employee o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }
}


class Employee {
    String name;
    Integer age;
    BigDecimal salary;

    public Employee(String name, Integer age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
