package javappa_com.optionalWmetodzieFilter;

import java.util.Arrays;
import java.util.List;

public class OptionalWfilter {
    public static void main(String[] args) {
        List<MovieItem> movies =  Arrays.asList(new MovieItem("Parasite", "Dramat"),
                new MovieItem("Kac Vegas", "Komedia"),
                new MovieItem("Bêkarty wojny", null),
                new MovieItem("Zielona mila", "Dramat"),
                new MovieItem("Ch³opaki nie p³acz±", "Komedia"),
                new MovieItem("American Pie", null));
        System.out.println("Movies with genre: ");
        movies.stream().filter(genre -> genre.getGenre().isPresent())
                .forEach(System.out::println);

        System.out.println("Movies without genre: ");
        movies.stream().filter(x -> !x.getGenre().isPresent())
                .forEach(System.out::println);

        System.out.println("Movies without genre (isEmpty()): ");
        movies.stream().filter(x -> x.getGenre().isEmpty())
                .forEach(System.out::println);
    }
}
