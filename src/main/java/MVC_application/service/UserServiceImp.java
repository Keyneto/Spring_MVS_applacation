package MVC_application.service;

import MVC_application.dao.UserDao;
import MVC_application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

   @Transactional
   @Override
   public void remove(Long id) {
      userDao.remove(id);
   }

   @Transactional
   @Override
   public User getUserById(Long id) {
      return userDao.getUserById(id);
   }

   @Transactional
   @Override
   public void update(User user, Long id) {
      userDao.update(user, id);
   }
}
