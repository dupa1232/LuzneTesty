package a1024kbPl.builder;

public class User {
    private String login;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private int age;
    private Gender gender;

    private User(String login, String name, String lastname, String email, String password, int age, Gender gender) {
        this.login = login;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static class Builder {
        private String login;
        private String name;
        private String lastname;
        private String email;
        private String password;
        private int age;
        private Gender gender;

        public Builder() {}

        public Builder setLogin(String login) {
            this.login = login;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public User build() {
            return new User(login, name,lastname,email,password,age,gender);
        }
    }
}
