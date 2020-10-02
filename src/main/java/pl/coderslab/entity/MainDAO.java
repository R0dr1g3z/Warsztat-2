package pl.coderslab.entity;

import java.util.Arrays;

public class MainDAO {
    public static void main(String[] args) {
//        User user = new User();
//        user.setEmail("Kamikowski@gmail.com");
//        user.setPassword("Kamyczek909012");
//        user.setUsername("Kamilek");
//        UserDAO userDAO = new UserDAO();
//        userDAO.create(user);

//        UserDAO userDAO = new UserDAO();
//        User user1 = userDAO.read(2);
//        System.out.println(user1);

//        UserDAO userDAO = new UserDAO();
//        User user1 = new User();
//        user1.setUsername("Arek");
//        user1.setPassword("Areczek1234");
//        user1.setEmail("Areczka@gmail.com");
//        userDAO.update(user1, 4);

//        UserDAO userDAO = new UserDAO();
//        userDAO.delete(6);

        UserDAO userDAO = new UserDAO();
        User[] users = userDAO.readAll();
        System.out.println(Arrays.toString(users));
    }
}
