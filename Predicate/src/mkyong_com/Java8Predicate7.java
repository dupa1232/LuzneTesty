package mkyong_com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate7 {
    //7. Predicate in Object

    public static void main(String[] args) {
        Hosting h1 = new Hosting(1, "amazon", "aws.amazon.com");
        Hosting h2 = new Hosting(2, "linode", "linode.com");
        Hosting h3 = new Hosting(3, "liquidweb", "liquidweb.com");
        Hosting h4 = new Hosting(4, "google", "google.com");

        List<Hosting> list = Arrays.asList(new Hosting[]{h1,h2,h3,h4});

        /// google trza uzyskac
        List<Hosting> result = HostingRepository.filterHosting(list, c -> c.getName().startsWith("g"));
        System.out.println(result);

        /// linode zwroci
        List<Hosting> result2 = HostingRepository.filterHosting(list, isDeveloperFriendly());
        System.out.println(result2);
    }

    public static Predicate<Hosting> isDeveloperFriendly() {
        return x -> x.getName().equals("linode");
    }
}

class Hosting {
    private int Id;
    private String name;
    private String url;

    public Hosting(int id, String name, String url) {
        Id = id;
        this.name = name;
        this.url = url;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Hosting{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

class HostingRepository {
    public static List<Hosting> filterHosting(List<Hosting> hostings, Predicate<Hosting> predicate) {
        return hostings.stream().filter(predicate).collect(Collectors.toList());
    }
}