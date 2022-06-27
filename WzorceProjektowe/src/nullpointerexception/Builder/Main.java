package nullpointerexception.Builder;

public class Main {

    /*
    https://nullpointerexception.pl/3-najpopularniejsze-wzorce-projektowe/

        Tutaj przyk��dem jest wewn�trzna klasa statyczna Builder, kt�a odpowiada za obs�ug� wzorca.
        Mo�na te� wspiera� si� bibliotek� Lombok, dzi�ki kt�rej, jak u�yjemy adnotacji @Builder na klasie Person,
        to nie b�dziemy musieli robi� tego, co w tym przypadku r�cznie robimy.

     */
    public static void main(String[] args) {
        Person person = new Person.Builder().age(2).name("Jacek").build();
        System.out.println(person);
        Person person2 = new Person.Builder().age(4).name("Jacekhhhh").build();
        System.out.println(person2);
    }
}
