package samouczekProgramisty;

public class OuterClass2 {

    public static class InnerClass2 {


    }

    private InnerClass2 metodaInnerClass2WOuterClass2Private() {
        return new InnerClass2();
    }

    public InnerClass2 metodaInnerClass2WOuterClass2() {
        return new InnerClass2();
    }
}
