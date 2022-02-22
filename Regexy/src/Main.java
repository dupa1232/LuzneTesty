import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher("dupa cipa penis");
        while (matcher.find()) {
            // Get the group matched using group() method
            System.out.println(matcher.group());
        }
    }
}
