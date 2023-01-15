package a1024kbPl.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder().setAge(2).setName("asss").build();
        System.out.println(user.toString());
    }
}
