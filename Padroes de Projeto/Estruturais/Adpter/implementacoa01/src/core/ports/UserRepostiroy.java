package core.ports;

import core.model.User;

import java.util.List;

public interface UserRepostiroy {

    void save(User user);
    List<User> getAll();
}
