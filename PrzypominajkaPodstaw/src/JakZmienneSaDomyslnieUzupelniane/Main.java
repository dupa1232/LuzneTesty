package JakZmienneSaDomyslnieUzupelniane;

public class Main {

    public static void main(String[] args) {
        KlasaZeZmiennymi klasaZeZmiennymi = new KlasaZeZmiennymi();

        System.out.println(klasaZeZmiennymi.getArray()); // null
        System.out.println(klasaZeZmiennymi.getBulinDuzy()); // null
        System.out.println(klasaZeZmiennymi.getZmiennaInt()); // 0
        System.out.println(klasaZeZmiennymi.getListaIntegerow()); // null
        System.out.println(klasaZeZmiennymi.isBulinMaly()); // false
        System.out.println(klasaZeZmiennymi.getZmiennaString()); // null
        System.out.println(klasaZeZmiennymi.getListaStringow()); // null
        System.out.println(klasaZeZmiennymi.getStringBuilder()); // null
    }
}
