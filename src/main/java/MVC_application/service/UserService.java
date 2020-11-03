package MVC_application.service;

import MVC_application.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    void remove(Long id);
    User getUserById(Long id);
    void update(User user, Long id);
}
