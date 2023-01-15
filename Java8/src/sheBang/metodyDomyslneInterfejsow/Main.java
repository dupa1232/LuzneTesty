package sheBang.metodyDomyslneInterfejsow;

public class Main {

    public static void main(String[] args) {
        Interfejs interfejs = new Interfejs() {
            @Override
            public int sum(int a, int b) {
                return 0;
            }
        };

        System.out.println(interfejs.sum(2,4));
        System.out.println(interfejs.sqrt(4));
    }
}
