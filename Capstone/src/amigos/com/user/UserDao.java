package amigos.com.user;

public class UserDao {
    private static User[] users;

    static {
        users = new User[] { new User("User1"),new User("User2")};
    }

    public User[] getAllUsers(){
        return this.users;
    }
}
