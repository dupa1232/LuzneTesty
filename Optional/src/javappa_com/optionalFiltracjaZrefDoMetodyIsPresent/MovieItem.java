package javappa_com.optionalFiltracjaZrefDoMetodyIsPresent;

import java.util.Optional;

public class MovieItem {

    private String title;
    private String genre;

    public MovieItem(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public Optional<String> getGenre() {
        return Optional.ofNullable(genre);
    }

    @Override
    public String toString() {
        return title;
    }
}
