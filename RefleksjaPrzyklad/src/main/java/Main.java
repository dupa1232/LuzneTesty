import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Klasa klasa = new Klasa();
        klasa.metodaWzbogacajacaNazwePublic();
        System.out.println("------------------------------");
        //Normalne wywolanie jest powyzej


        try {
            //refleksja jest ponizej

            ////////////////////////////// ta refleksja do metody publicznej nie dziala
            Object refleksjaObiektKlasy = Klasa.class.getDeclaredConstructor().newInstance();
//            Method refleksjaDlaMetodyPublicznej = Klasa.class.getClass().getDeclaredMethod("metodaWzbogacajacaNazwePublic", new Class<?>[0]);
            System.out.println("1111 ->>>>");
//            refleksjaDlaMetodyPublicznej.invoke(refleksjaObiektKlasy);
            /// w sumie wywala sie powyzsze, bo ava.lang.NoSuchMethodException -- w sumie nie wiem dlaczego
            ////////////////////////////// ta refleksja do metody publicznej nie dziala


            ///////////////////////// ta refleksja do metody publicznej dziala
            Method metodaPubliczna = Klasa.class.getDeclaredMethod("metodaWzbogacajacaNazwePublic");
            // nie trzeba ustawiac .setAccesible()!!!
            System.out.println("2222 ->>> ");
            metodaPubliczna.invoke(klasa);
            ///////////////////////// ta refleksja do metody publicznej dziala



            /////////////////////////// refleksja dla metody prywatnej
            Method metodaPrywatna = Klasa.class.getDeclaredMethod("metodaWzbogacajacaNazwe");
            // trzeba ustawic "accesibilitalnosc"
            metodaPrywatna.setAccessible(true);
            System.out.println("3333 ->>> ");
            metodaPrywatna.invoke(klasa);
            ////////////////////////// refleksja dla metody prywatnej


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
