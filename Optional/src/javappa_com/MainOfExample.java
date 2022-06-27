package javappa_com;

import java.util.Optional;

public class MainOfExample {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Optional szit");

        if(optionalString.isPresent()) {
            System.out.println("Optional szit vaalue");
            System.out.println(optionalString.get());
        }

        /// to rzuci wyjatkiem
        Optional<String> nullowyOptional = Optional.of(null);
    }
}
