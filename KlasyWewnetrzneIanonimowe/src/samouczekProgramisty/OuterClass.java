package samouczekProgramisty;

public class OuterClass {

    public class InnerClass{

        public InnerClass konstruktorWewnatrzInnerClass() {
            return new InnerClass();
        }
    }

    public InnerClass konstruktorWewnatrzOuterClass() {
        return new InnerClass(); /// czyli z poziomu OuterClass da siê utworzyæ instancjê InnerClass
    }
}
