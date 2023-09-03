package session11.practice.userservice;

public interface UserService {

    /**
     * Creates a user
     * @param user
     */
    void createUser(User user);

    User findUserById(long id);

    void deleteUser(long id);
}