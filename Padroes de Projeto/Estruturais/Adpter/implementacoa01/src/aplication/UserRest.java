package aplication;

import core.model.User;
import core.ports.UserRepostiroy;
import core.usercases.UserServices;
import infrastructure.UserMemoryDataBasesAdpter;

import java.util.List;
import java.util.Map;

public class UserRest {

    private UserServices userFacade;

    public UserRest() {
        UserRepostiroy userRepo = new UserMemoryDataBasesAdpter();
        userFacade = new UserServices(userRepo);
    }

    public Integer post(Map<String, String> values) {

        try {
            User user = new User(values.get("name"), values.get("email"), values.get(""));
            userFacade.saveUser(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 400;
        }

        return 201;


    }

    public Integer get(){

        List<User> users = userFacade.getUser();
        users.stream().forEach(System.out::println);
        return 200;
    }


}
