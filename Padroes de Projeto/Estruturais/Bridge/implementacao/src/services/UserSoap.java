package services;

import dao.UserDaoBridge;
import model.User;

public class UserSoap extends UserService{

    public UserSoap(UserDaoBridge dao) {
        super(dao);
    }

    @Override
    public void save(User user) {

        System.out.println("Starting a save operation through SOAP");
        dao.save(user);

    }
}
