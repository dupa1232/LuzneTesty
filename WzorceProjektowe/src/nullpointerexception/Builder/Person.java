package nullpointerexception.Builder;



public class Person {

    private String name;
    private int age;

    public static Builder builder()  {
        return new Builder();
    }

    public static class Builder {
        private Person person = new Person();

        public Builder name(String name) {
            person.name = name;
            return this;
        }

        public Builder age(int age) {
            person.age = age;
            return this;
        }

        public Person build() {
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
