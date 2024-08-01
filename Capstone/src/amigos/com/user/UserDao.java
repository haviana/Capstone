package amigos.com.user;

import java.util.Arrays;

public class UserDao {
    private static User[] users;

    static {
        users = new User[] { new User("User1"),new User("User2")};
    }

    public User[] getAllUsers(){
        return this.users;
    }

    public User getUser(int Id){
        return Arrays.stream(users).filter(x->x.equals(Id)).findAny().get();
    }
}
