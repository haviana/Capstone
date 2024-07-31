package amigos.com.user;

import java.util.UUID;

public record User(UUID uuid, String name) {
    public User(String name){
        this(UUID.randomUUID(),name);
    }
}
