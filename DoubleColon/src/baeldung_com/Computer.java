package baeldung_com;

import java.util.Objects;

public class Computer implements Comparable<Computer>{
    private Integer age;
    private Integer healty;
    private String name;

    public Computer(int age, int healty, String name) {
        this.age = age;
        this.healty = healty;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Integer getHealty() {
        return healty;
    }

    void setHealty(final Integer healty) {
        this.healty = healty;
    }

    public void turnOnPC() {
        System.out.println("Turn on computer");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(age, computer.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }


    @Override
    public int compareTo(Computer o) {
        return 0;
    }

    public int compareTo(Computer o1, Computer o2) {
        return 0;
    }
}
