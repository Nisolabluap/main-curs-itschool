package session12.practice.userservice;

public class UserServiceImpl implements UserService {

    @Override
    public void createUser() {

    }

    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        UserService userService = userServiceImpl;
    }
}