package java67_com;

import java.util.Comparator;

public class Comparators implements Comparator<Person> {


    public static  int comparing(Person o1, Person o2) {
        Comparators comparators = new Comparators();
        return comparators.compare(o1,o2);
    }

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
