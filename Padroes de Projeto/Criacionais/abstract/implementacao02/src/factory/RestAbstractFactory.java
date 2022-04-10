package factory;

import service.CarService;
import service.UserRestApiService;
import service.UserService;

public class RestAbstractFactory implements ServiceAbstractFactory{
    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }

    @Override
    public CarService getCarService() {
        return null;
    }
}
