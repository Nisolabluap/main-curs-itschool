package session15.practice.team.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {

    private String username;
    private UUID uuid;
    private List<Post> posts;

    public User(String username) {
        this.username = username;
        uuid = UUID.randomUUID();
        List<Post> posts = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UUID getUuid() {
        return uuid;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}