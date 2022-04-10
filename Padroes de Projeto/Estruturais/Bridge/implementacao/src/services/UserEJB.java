package services;

import dao.UserDaoBridge;
import model.User;

public class UserEJB extends UserService{

    public UserEJB(UserDaoBridge dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through EJB");
        dao.save(user);
    }
}
