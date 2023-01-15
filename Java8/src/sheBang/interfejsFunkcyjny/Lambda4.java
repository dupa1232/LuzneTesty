package sheBang.interfejsFunkcyjny;

public class Lambda4 {
    static int outerStaticNum;
    int outerNum;
    void testScopes() {
        InterfejsFunkcyjny<Integer, String> stringConverter1 =
                (x) -> {
                    outerNum = 22;
                    return String.valueOf(x);
                };
        InterfejsFunkcyjny<Integer, String> stringConverter2 =
                z -> {
                    outerStaticNum = 2222;
                    return String.valueOf(z);
                };
    }
}
