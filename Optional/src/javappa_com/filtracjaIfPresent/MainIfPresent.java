package javappa_com.filtracjaIfPresent;

import java.util.Arrays;
import java.util.List;

public class MainIfPresent {

    public static void main(String[] args) {

        List<MovieItem> movies = Arrays.asList(new MovieItem("Parasite", "Dramat"),
                new MovieItem("Kac Vegas", "Komedia"),
                new MovieItem("Bêkarty wojny", null),
                new MovieItem("Zielona mila", "Dramat"),
                new MovieItem("Ch³opaki nie p³acz±", "Komedia"),
                new MovieItem("American Pie", null));

        System.out.println("Not empty and not unique genres:");
        movies.stream()
                .map(MovieItem::getGenre)
                .forEach(x -> x.ifPresent(System.out::println));

        System.out.println("\nNot empty unique genres:");
        movies.stream()
                .map(MovieItem::getGenre)
                .distinct()
                .forEach(x -> x.ifPresent(System.out::println));
    }

    /*
    Wy¶wietli (czyli tutaj, .toString() nie ma znaczenia, bo bazujemy na -> .map(Movie::getGenre)!!!!!!!!!!!!):

    Not empty and not unique genres:
    Dramat
    Komedia
    Dramat
    Komedia

    Not empty unique genres:
    Dramat
    Komedia
     */
}
