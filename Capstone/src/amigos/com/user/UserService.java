package amigos.com.user;

public class UserService {
    UserDao userDao = new UserDao();
    public User[] getAllUsers(){
        return userDao.getAllUsers();

    }
}
