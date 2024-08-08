package amigos.com.user;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.UUID;

public class UserFileDataAccessService implements UserDao {

    private final String filePath = "Capstone/src/User.csv";
    private static User[] users = new User[4];

    @Override
    public User[] getAllUsers() {
        File file = new File(filePath);

        try {
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");
                users[count++] =new  User(UUID.fromString(fields[0]), fields[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Inexistent file");
            return null;
        }


        return users;
    }
}
