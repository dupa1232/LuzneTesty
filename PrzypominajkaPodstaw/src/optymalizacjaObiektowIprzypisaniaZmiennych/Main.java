package optymalizacjaObiektowIprzypisaniaZmiennych;

public class Main {
    public static void main(String[] args) {
        String a1 = "a";
        String a2 = new String("a");
        String a3 = a1;
        String a4 = a2;
        String a5 = new String(a3);
        String a6 = "a";
        String a7 = new String("a");
        String a8 = a1;
        String a9 = a2;
        String a10 = new String(a8);
        String a11 = new String("a");
        String a12 = "a";
        System.out.println("a1 hashcode: " +a1.hashCode());
        System.out.println("a2 hashcode: " +a2.hashCode());
        System.out.println("a3 hashcode: " +a3.hashCode());
        System.out.println("a4 hashcode: " +a4.hashCode());
        System.out.println("a5 hashcode: " +a5.hashCode());
        System.out.println("a6 hashcode: " +a6.hashCode());
        System.out.println("a7 hashcode: " +a7.hashCode());
        System.out.println("a8 hashcode: " +a8.hashCode());
        System.out.println("a9 hashcode: " +a9.hashCode());
        System.out.println("a10 hashcode: " +a10.hashCode());
        System.out.println();
        System.out.println(a1 == a2);
        System.out.println(a2 == a11);
        System.out.println(a1 == a12);
        System.out.println(a10 == a8);

        /*
        a1 hashcode: 97
        a2 hashcode: 97
        a3 hashcode: 97
        a4 hashcode: 97
        a5 hashcode: 97
        a6 hashcode: 97
        a7 hashcode: 97
        a8 hashcode: 97
        a9 hashcode: 97
        a10 hashcode: 97

        false
        false
        true
        false

         */
    }

}
