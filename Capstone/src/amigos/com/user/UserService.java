package amigos.com.user;

import java.util.UUID;

public class UserService {
    UserArrayDataAccessService userDao = new UserArrayDataAccessService();

    public User[] getAllUsers() {
        return userDao.getAllUsers();

    }

    public User getById(UUID uuid) {
        return userDao.getById(uuid);
    }
}
