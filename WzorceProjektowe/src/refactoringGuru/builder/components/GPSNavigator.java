package refactoringGuru.builder.components;

public class GPSNavigator {

    private String route;

    public GPSNavigator() {
        this.route = "Jedziem do domy!";
    }

    public String getRoute() {
        return this.route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
