package service;

public class UserEJBService  implements UserService{


    @Override
    public void save(String name) {
        System.out.println("Saving " + name + " through EJBS interface");
    }

    @Override
    public Boolean delete(Integer id) {
        System.out.println("Removing User # " + id + "through EJBS" );
        return true;

    }
}
