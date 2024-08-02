package amigos.com.user;

import java.util.Arrays;
import java.util.UUID;

public class UserDao {
    private static User[] users;

    static {
        users = new User[] { new User("User1"),new User("User2")};
    }

    public User[] getAllUsers(){
        return this.users;
    }

    public User getById(UUID Id){
        return Arrays.stream(users).filter(x->x.uuid().equals(Id)).findAny().get();
    }
}
