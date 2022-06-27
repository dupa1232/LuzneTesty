package javappa_com;

import java.util.Optional;

public class MainOfNullableExample {
    public static void main(String[] args) {

        Optional<String> ofNullableOptional = Optional.ofNullable("aaaaaaa ");
        if(ofNullableOptional.isPresent()) {
            System.out.println("ofNullableOptional value:");
            System.out.println(ofNullableOptional.get());
        }

        // isPresent() zwroci false, bo dla ofNullable() mozna dawac null
        Optional<String> ofNullableOptionalNull = Optional.ofNullable(null);
        if(ofNullableOptionalNull.isPresent()) {
            System.out.println(ofNullableOptionalNull.get());
        }
        else
            System.out.println("Empty value");

    }
}
