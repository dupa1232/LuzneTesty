package nullpointerexception.Builder;

public class Main {

    /*
    https://nullpointerexception.pl/3-najpopularniejsze-wzorce-projektowe/

        Tutaj przyk³±dem jest wewnêtrzna klasa statyczna Builder, któa odpowiada za obs³ugê wzorca.
        Mo¿na te¿ wspieraæ siê bibliotek± Lombok, dziêki której, jak u¿yjemy adnotacji @Builder na klasie Person,
        to nie bêdziemy musieli robiæ tego, co w tym przypadku rêcznie robimy.

     */
    public static void main(String[] args) {
        Person person = new Person.Builder().age(2).name("Jacek").build();
        System.out.println(person);
        Person person2 = new Person.Builder().age(4).name("Jacekhhhh").build();
        System.out.println(person2);
    }
}
