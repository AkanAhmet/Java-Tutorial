package Design_Patterns.Builder_Design;

public class BuilderPattern {

    public static void main(String[] args) {

        User user = new User.UserBuilder("Ahmet","AKAN").age(23).phone("905075514365").build();
        User user2 = new User.UserBuilder("Kerim","kerim").age(23).build();
        User user3 = new User.UserBuilder("Enes","enes").build();
    }


}
