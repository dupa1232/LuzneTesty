import java.util.Arrays;
import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {
        int[] tablica = {3,4,2,3};
        int[] tablica2 = tablica.clone();

        for(int el : tablica)
        {
            System.out.println(el);
        }
        System.out.println("////////");
        for(int el : tablica2)
        {
            System.out.println(el);
        }
        System.out.println(tablica.length); // 4
        System.out.println(tablica == tablica2); // false
        System.out.println(tablica.equals(tablica2)); // false\
        System.out.println(tablica[1] == tablica2[1]); // true
//        System.out.println(tablica[1].equals(tablica2[1])); /// takie co¶ nie jest mo¿liwe, bo mamy tablicê prymitywów

        //// DU¯E INTEGER-YYYyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy
        System.out.println("INTEGEEEERyyyy");
        Integer[] tablicaInteger = {3,6,2,2};
        Integer[] tablicaInteger2 = tablicaInteger.clone();

        System.out.println(tablicaInteger.length); // 4
        System.out.println(tablicaInteger == tablicaInteger2); // false
        System.out.println(tablicaInteger.equals(tablicaInteger2)); // false
        System.out.println(tablicaInteger[1] == tablicaInteger2[1]); //true
        System.out.println(tablicaInteger[1].equals(tablicaInteger2[1])); //true

        // Ma³y int copOf()
        System.out.println("Arrays.copyOf(x,y)");
        int[] tab = {1,2,3};
        Arrays.copyOf(tab,7);
        for(int el : tab)
        {
            System.out.println(el);
        } // wydrukuje: 1,2,3 /// czyli jakby nie zwiêkszy³o tablicy, bo na podstawie https://www.geeksforgeeks.org/array-class-in-java/ powinno zwiêkszyæ i wydrukowaæ zera w tych nowych miejscach

        /// copyOf() dla Integer tablicy
        System.out.println("copyOf() dla Integer");
        Integer[] tabInteger = {3,6,1,2};
        Arrays.copyOf(tabInteger,8);
        for(Integer el : tabInteger)
        {
            System.out.println(el); // wydrukuje: 3,6,1,2 /// czyli jakby nie zwiêkszy³o tablicy, bo na podstawie https://www.geeksforgeeks.org/array-class-in-java/ powinno zwiêkszyæ i wydrukowaæ zera w tych nowych miejscach
        }

        // SORTOWANIE MALEJ¡CE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // w oparciu o https://www.geeksforgeeks.org/array-class-in-java/
        Arrays.sort(tabInteger, new SortDescInteger());
        System.out.println("po sortowaniu");
        for(Integer el : tabInteger)
        {
            System.out.println(el); /// i ³adnie sortuje malej±co
        }
    }
    /* xxxx*/

}
class SortDescInteger implements Comparator<Integer> { /// jakby siê da³o static na pocz±tku, to mo¿na by³oby zawrzeæ w klasie Main2 tê metodê, czyli tu /* xxxx*/

    @Override
    public int compare(Integer o1, Integer o2) {
//        return o2.compareTo(o1);
        return  o2-o1; /// oba daj± ten sam efekt w sortowaniu
    }
}
