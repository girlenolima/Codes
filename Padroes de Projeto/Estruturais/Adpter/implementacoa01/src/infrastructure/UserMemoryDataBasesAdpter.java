package infrastructure;

import core.model.User;
import core.ports.UserRepostiroy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMemoryDataBasesAdpter implements UserRepostiroy {

    private Map<String, User> memoryUsers = new HashMap<String, User>();
    @Override
    public void save(User user) {
        memoryUsers.put(user.getEmail(), user);
    }

    @Override
    public List<User> getAll() {
        return null;

    }
}
