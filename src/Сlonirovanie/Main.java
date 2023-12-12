package Сlonirovanie;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User(1, "Alex", new Address("Minsk"));
        User user2 = (User) user1.clone();
        User user3 = user1.deepClone();

        System.out.println(user1.address.city);
        System.out.println(user2.address.city);
        System.out.println(user3.address.city);

        user2.address.city = "Moscow";
        user3.address.city = "Paris";

        System.out.println(user1.address.city);
        System.out.println(user2.address.city);
        System.out.println(user3.address.city);
    }
}