package session15.practice.team.application;

import session15.practice.team.domain.User;
import session15.practice.team.domain.Wall;
import session15.practice.team.services.UserService;

public class Main {

    public static void main(String[] args) {
        User user = new User("Paul");
        Wall wall = new Wall();
        UserService userService = new UserService();

        wall.getTheWall().add(userService.postItem("Hello","Beach",user));
        System.out.println(wall);
    }
}