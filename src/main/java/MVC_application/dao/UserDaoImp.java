package MVC_application.dao;

import MVC_application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @Autowired
   private EntityManagerFactory entityManagerFactory;

   @Override
   public void add(User user) {
         EntityManager em = entityManagerFactory.createEntityManager();
         em.getTransaction().begin();
         em.persist(user);
         em.getTransaction().commit();
   }

   @Override
   public List<User> listUsers() {
      EntityManager em = entityManagerFactory.createEntityManager();
      List<User> movies = em.createQuery("FROM User")
              .getResultList();
      return movies;
   }

   @Override
   public void remove(Long id) {
         EntityManager em = entityManagerFactory.createEntityManager();
         em.getTransaction().begin();
         User user = em.find(User.class, id);
         em.remove(user);
         em.getTransaction().commit();
   }

   @Override
   public User getUserById(Long id) {
      EntityManager em = entityManagerFactory.createEntityManager();
      em.getTransaction().begin();
      User user = em.find(User.class, id);
      em.getTransaction().commit();
      return user;
   }


   @Override
   public void update(User user, Long id) {
      EntityManager em = entityManagerFactory.createEntityManager();
      em.getTransaction().begin();
      User usernew = em.find(User.class, id);
      usernew.setFirstName(user.getFirstName());
      usernew.setLastName(user.getLastName());
      usernew.setEmail(user.getEmail());
      em.merge(usernew); // modify person data
      em.getTransaction().commit();
   }
}
