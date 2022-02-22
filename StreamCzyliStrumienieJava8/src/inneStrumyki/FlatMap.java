package inneStrumyki;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Foo {
    String name;
    List<Bar> bars = new ArrayList<>();

    Foo(String name) {
        this.name = name;
    }
}
class Bar {
    String name;

    Bar(String name) {
        this.name = name;
    }
}

public class FlatMap {
    public static void main(String[] args) {
        List<Foo> foos = new ArrayList<>();
        IntStream.range(1,4).forEach(p->foos.add(new Foo("Foo" + p)));
        foos.forEach(f ->IntStream.range(1,4).forEach(i -> f.bars.add(new Bar("bar " +i+ " --- " +f.name))));

        foos.forEach(f -> f.bars.stream().forEach(p-> System.out.println(p.name)));
        /*
        bar 1 --- Foo1
        bar 2 --- Foo1
        bar 3 --- Foo1
        bar 1 --- Foo2
        bar 2 --- Foo2
        bar 3 --- Foo2
        bar 1 --- Foo3
        bar 2 --- Foo3
        bar 3 --- Foo3
         */
        // czyli powy¿sze jest równowa¿ne
        System.out.println("---");
        for(Foo foo : foos) {
            for(Bar bar : foo.bars){
                System.out.println(bar.name);
            }
        }
        System.out.println("docelowy flat map");
        foos.stream()
                .flatMap(f->f.bars.stream())
                .forEach(b -> System.out.println(b.name));

        // mo¿na to te¿ tak zrobiæ - w jednym strumieniu
        System.out.println("Wszystko w jednymmmm ---------------");
        IntStream.range(1,4).mapToObj(i -> new Foo("Foo " + i))
                .peek(f -> IntStream.range(1,4).mapToObj(i -> new Bar("Bar " + i+ " --- " + f.name))
                .forEach(f.bars::add))
                .flatMap(f -> f.bars.stream())
                .forEach(p -> System.out.println(p.name));
    }
}
