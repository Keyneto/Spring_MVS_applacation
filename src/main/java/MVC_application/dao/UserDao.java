package MVC_application.dao;

import MVC_application.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   void remove(Long id);
   User getUserById(Long id);
   void update(User user, Long id);
}
