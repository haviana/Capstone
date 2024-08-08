package amigos.com.user;

import java.util.UUID;

public class UserService {
    UserDao userDao ;
    UserArrayDataAccessService userDao = new UserArrayDataAccessService();

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
    public User[] getAllUsers() {
        return userDao.getAllUsers();

    }

    public User getById(UUID uuid) {
        return userDao.getById(uuid);
    }
}
