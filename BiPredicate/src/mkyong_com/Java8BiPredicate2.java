package mkyong_com;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Java8BiPredicate2 {
    // 2. BiPredicate as function argument.
    public static void main(String[] args) {
        List<Domain> domains = Arrays.asList(new Domain("google.com", 1),
                new Domain("i-am-spammer.com", 10),
                new Domain("mkyong.com", 0),
                new Domain("microsoft.com", 2));

        BiPredicate<String, Integer> bi = (domain, score) -> {
            return domain.equalsIgnoreCase("google.com")  || score == 0;
        };

        // if google or score == 0
        List<Domain> result = Java8BiPredicate2.filterByDomain(domains, bi);
        System.out.println("result --- " +result);
        //result --- [Domain{name='google.com', score=1}, Domain{name='mkyong.com', score=0}]

        //  if score == 0
        List<Domain> result2 = Java8BiPredicate2.filterByDomain(domains, (x,y) -> y == 0);
        System.out.println("result2 --- " +result2);
        //result2 --- [Domain{name='mkyong.com', score=0}]

        // if start with i or score > 5
        List<Domain> result3 = Java8BiPredicate2.filterByDomain(domains, (x, y) -> x.startsWith("i") && y > 5);
        System.out.println("result3 --- " +result3);
        //result3 --- [Domain{name='i-am-spammer.com', score=10}]

        // chaining with o
        List<Domain> result4 = Java8BiPredicate2.filterByDomain(domains, bi.or((domain, score) -> domain.startsWith("o")));
        System.out.println("result4 --- " +result4);
        //result4 --- [Domain{name='google.com', score=1}, Domain{name='mkyong.com', score=0}]
    }

    public static <T extends Domain> List<T> filterByDomain(List<T> domains, BiPredicate<String, Integer> biPredicate) {
        return domains.stream().filter(x -> biPredicate.test(x.getName(), x.getScore())).collect(Collectors.toList());
    }
}

class Domain {
    String name;
    Integer score;

    public Domain(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Domain{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}