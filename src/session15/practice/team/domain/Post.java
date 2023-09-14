package session15.practice.team.domain;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private String title;
    private User author;
    private String content;
    private List<String> comments;

    public List<Reactions> getReactions() {
        return reactions;
    }

    private List<Reactions> reactions;

    public Post(String title, User author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.comments = new ArrayList<>();
        this.reactions = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "content='" + content + '\'' +
                ", author=" + author +
                '}';
    }
}