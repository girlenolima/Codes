package services;

import dao.UserDaoBridge;
import model.User;

public class UserRest extends UserService{

    public UserRest(UserDaoBridge dao) {
        super(dao);
    }

    @Override
    public void save(User user) {

        System.out.println("Starting a save operation through REST");
        dao.save(user);
    }
}
