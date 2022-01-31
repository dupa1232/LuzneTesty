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
    }
}
