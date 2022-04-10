package factory;

import service.CarService;
import service.UserEJBService;
import service.UserService;

public class EJBAbstractFactory implements  ServiceAbstractFactory{
    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return null;
    }
}
