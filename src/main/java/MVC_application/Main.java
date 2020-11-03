//package MVC_application;
//
//import MVC_application.config.HibernateConfig;
//import MVC_application.model.User;
//import MVC_application.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//@Component
//public class Main {
//    @Autowired
//    UserService userService;
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.sdfsd();
//    }
//
//    public void sdfsd() {
//        userService.add(new User("Юзер", "Lastname1", "user1@mail.ru"));
//        userService.add(new User("вапр", "Lastname2", "user2@mail.ru"));
//        userService.add(new User("вапр", "Lastname3", "user3@mail.ru"));
//        userService.add(new User("вапрап", "Lastname4", "user4@mail.ru"));
//        userService.add(new User("вапр", "Lastname5", "user5@mail.ru"));
//
//
//        List<User> users = userService.listUsers();
//        for (User user : users) {
//            System.out.println("Id = " + user.getId());
//            System.out.println("First Name = " + user.getFirstName());
//            System.out.println("Last Name = " + user.getLastName());
//            System.out.println("Email = " + user.getEmail());
//            System.out.println();
//
//        }
//    }
//}
