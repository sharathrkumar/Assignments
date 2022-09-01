public class Main {
    public static void main(String[] args) {
        User user1 = new User.BuilderClass("Sharath","1234")
                .name("Sharath")
                .id("145")
                .build();
        System.out.println(user1);
    }
}