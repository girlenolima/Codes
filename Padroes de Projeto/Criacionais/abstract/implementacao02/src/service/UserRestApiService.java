package service;

public class UserRestApiService implements UserService{
    @Override
    public void save(String name) {
        System.out.println("Saving " + name + " through REST interface");
    }

    @Override
    public Boolean delete(Integer id) {
        System.out.println("Removing User # " + id + "through REST" );
        return true;
    }
}
