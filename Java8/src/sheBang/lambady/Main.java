package sheBang.lambady;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // tak by³o przed java 8
        List<String> lista = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        /// tak mo¿na dziêki java 8
        Collections.sort(lista, (String a, String b) -> {
            return a.compareTo(b);
        });
        Collections.sort(lista, (String a, String b) -> a.compareTo(b));
        Collections.sort(lista, (a, b) -> a.compareTo(b));

    }
}
