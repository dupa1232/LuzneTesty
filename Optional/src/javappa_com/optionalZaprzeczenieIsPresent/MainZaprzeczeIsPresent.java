package javappa_com.optionalZaprzeczenieIsPresent;

import java.util.Arrays;
import java.util.List;

public class MainZaprzeczeIsPresent {

    public static void main(String[] args) {
        List<MovieItem> movies = Arrays.asList(new MovieItem("Parasite", "Dramat"),
                new MovieItem("Kac Vegas", "Komedia"),
                new MovieItem("Bêkarty wojny", null),
                new MovieItem("Zielona mila", "Dramat"),
                new MovieItem("Ch³opaki nie p³acz±", "Komedia"),
                new MovieItem("American Pie", null));

        System.out.println("\nMovies without genre:");
        movies.stream()
                .filter(MovieItem::isEmptyGerne)
                .forEach(System.out::println);

        /*
        Zwróci (bo tak wygl±da toString() z MovieItem!):

        Movies without genre:
        Bêkarty wojny, null
        American Pie, null
         */
    }
}
