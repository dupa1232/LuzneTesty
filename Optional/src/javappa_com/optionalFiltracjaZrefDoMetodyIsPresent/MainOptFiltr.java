package javappa_com.optionalFiltracjaZrefDoMetodyIsPresent;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MainOptFiltr {

    public static void main(String[] args) {

        List<MovieItem> movies = Arrays.asList(new MovieItem("Parasite", "Dramat"),
                new MovieItem("Kac Vegas", "Komedia"),
                new MovieItem("Bêkarty wojny", null),
                new MovieItem("Zielona mila", "Dramat"),
                new MovieItem("Ch³opaki nie p³acz±", "Komedia"),
                new MovieItem("American Pie", null));

        System.out.println("Unique genres:");

        movies.stream()
                .map(MovieItem::getGenre)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .distinct()
                .forEach(System.out::println);

        /*
        Zwróci (bo na samym pocz±tku pobieramy getGenre() i na tym dzia³amy - dlatego m.in. tak zwrotka wyglada):

        Unique genres:
        Dramat
        Komedia
         */
    }
}
