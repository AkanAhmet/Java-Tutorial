package Design_Patterns.Builder_Design;

public class User {

    private  String name;
    private  String surname;
    private int age;
    private  String phone;
    private  String address;

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.surname = userBuilder.surname;
        this.age = userBuilder.age;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserBuilder {

        private final String name;
        private final String surname;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String surname) {
            this.name = firstName;
            this.surname = surname;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
