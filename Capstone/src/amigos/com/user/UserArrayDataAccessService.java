package amigos.com.user;

import java.util.Arrays;
import java.util.UUID;

public class UserArrayDataAccessService implements UserDao {
    private static User[] users;

    static {
        users = new User[]{new User("User1"), new User("User2")};
    }

    @Override
    public User[] getAllUsers() {
        return this.users;
    }


}
