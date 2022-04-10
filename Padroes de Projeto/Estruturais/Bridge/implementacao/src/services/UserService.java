package services;

import dao.UserDaoBridge;
import model.User;

public abstract class UserService {

    protected UserDaoBridge dao;

    public UserService(UserDaoBridge dao) {
        this.dao = dao;
    }

    public abstract void save(User user);
}
