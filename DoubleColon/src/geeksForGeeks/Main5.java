package geeksForGeeks;

import java.util.ArrayList;
import java.util.List;

public class Main5 {

    public Main5(String s) {
        System.out.println("Hello " +s);
    }
    public Main5(String[] s) {
        System.out.println("Hello " +s[0]);
    }


    public static void main(String[] args) {
        /////////////////////// 5) Class Constructor
        List<String> list = new ArrayList<>();
        list.add("Geeks");
        list.add("for");
        list.add("GEEKS");
        list.forEach(Main5::new);

//        List<String[]> list2 = new ArrayList<>();
//        list2.add(new String[] {"asd"});
//        list2.forEach(Main5::main);
        // takie wywo�anie jak wy�ej nie rzuca b��dem w IDE, ale co� si� zap�tla i si� wywala koniec ko�c�w :D



        /////////////////////// 5) Class Constructor
    }
}
