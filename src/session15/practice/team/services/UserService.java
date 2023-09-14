package session15.practice.team.services;

import session15.practice.team.domain.Post;
import session15.practice.team.domain.Reactions;
import session15.practice.team.domain.User;

public class UserService {

    public Post postItem(String title, String content, User user) {
        return new Post(title, user, content);
    }

    public void react(Reactions reaction, Post post) {
        post.getReactions().add(reaction);
    }


}