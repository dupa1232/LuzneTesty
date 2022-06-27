package ennumm;

public class Mian {
    public static void main(String[] args) {
        System.out.println(ZmiennaEnum.ZMIENNA_1);
        System.out.println(ZmiennaEnum.ZMIENNA_1.hashCode());
        System.out.println(ZmiennaEnum.ZMIENNA_2.hashCode());
        System.out.println(ZmiennaEnum.ZMIENNA_3.hashCode());

        /*
        Zwróci:

        ZMIENNA_1
        488970385
        1209271652
        93122545
         */
    }
}
