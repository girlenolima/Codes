package core.usercases;

import core.model.User;
import core.ports.UserRepostiroy;

import java.util.List;

public class UserServices {

 private UserRepostiroy userRepo;


    public UserServices(UserRepostiroy userRepo) {
        this.userRepo = userRepo;
    }

    public void saveUser(User user){
        boolean alreadyUsedEmail = userRepo.getAll().stream()
                .anyMatch(userDb -> userDb.getEmail().equalsIgnoreCase(user.getEmail()));
                if(alreadyUsedEmail) throw  new RuntimeException("Email adreess");
                userRepo.save(user);


    }

    public List<User> getUser(){

        return userRepo.getAll();

    }




}
