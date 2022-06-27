package mkyong_com;

import java.util.function.BiFunction;

public class Java8BiFunction3 {

    /// 3.1 This example uses BiFunction to create an object, acts as a factory pattern.
    // The GPS::new calls the following constructor, which accepts two arguments and return an object (GPS), so it matches with the BiFunction signature.

    public static void main(String[] args) {
        GPS obj = factory("40.22313", "23.3213", GPS::new);
        System.out.println(obj); //// GPS{Latitude='40.22313', Longitude='23.3213'}
    }

    public static <R extends GPS> R factory(String Latitude, String Longitude,
                                            BiFunction<String, String, R> func) {
        return func.apply(Latitude, Longitude);
    }
}


class GPS {
    String Latitude;
    String Longitude;

    public GPS(String latitude, String longitude) {
        Latitude = latitude;
        Longitude = longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    @Override
    public String toString() {
        return "GPS{" +
                "Latitude='" + Latitude + '\'' +
                ", Longitude='" + Longitude + '\'' +
                '}';
    }
}
