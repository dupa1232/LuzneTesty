package klasaMaPoleStatyczneAkonstruktor;

public class Mian {
    public static void main(String[] args) {
        Klassa klassa = new Klassa( 1, "ass");
        System.out.println(klassa.getB());
        System.out.println(klassa.getA()); /// w sumie, da sie tak zrobiæ, ale nie podpowiada³o samo,
        // ale jak wpisalem, to przeszlo i odpalenie aplikacji mozliwe jest
        //poniewaz iz, getA() jest statyczna, czyli:
        System.out.println(Klassa.getA());

        klassa.setA(22); /// oficjalnie, tez nie podpowiadalo setA(), ale jak wpisalem, to
        // przeszlo i odpalenie aplikacji mozliwe jest
        System.out.println(klassa.getA());
        System.out.println(Klassa.getA());

        /*
        Zwróci:
        ass
        1
        1
        22
        22
         */
    }
}
