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
        System.out.println(tablica.equals(tablica2)); // false
    }
}
