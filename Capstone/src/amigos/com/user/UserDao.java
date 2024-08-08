package amigos.com.user;

import java.util.Arrays;
import java.util.UUID;

public interface UserDao {
    User[] getAllUsers();
    default User getUserByID(UUID Id){
            return Arrays.stream(getAllUsers()).filter(x -> x.uuid().equals(Id)).findAny().get();
    };
}
