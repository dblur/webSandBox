import model.User;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("Dima","e@g","123");
        userService.saveUser(user);
        System.out.println("added user");

        userService.deleteUser(user);
        System.out.println("deleted user");
    }
}
