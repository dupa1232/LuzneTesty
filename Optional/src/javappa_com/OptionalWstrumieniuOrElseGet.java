package javappa_com;

import java.util.*;

public class OptionalWstrumieniuOrElseGet {
    public static void main(String[] args) {

        List<String> listaaa = new ArrayList<>();
        Optional<String> listaOptionallPusta = listaaa.stream().findFirst();
        useOptional(listaOptionallPusta);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        List<String> listaNiepusta = Arrays.asList("aaaa");
        Optional<String> listaNiepustaOptional = listaNiepusta.stream().findFirst();
        useOptional(listaNiepustaOptional);
    }

    public static void useOptional(Optional<String> itemOptional) {
        if(!itemOptional.isPresent())
            System.out.println("ItemOptional is empty! We have string for you: ");
        System.out.println(itemOptional.orElseGet(() -> UUID.randomUUID().toString()));
    }
    /*
    Wy¶wietli:

    ItemOptional is empty! We have string for you:
    2562244e-9018-4032-8844-3f75e9736e50
    xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    aaaa

     */
}
