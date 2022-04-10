package factory;

import service.CarService;
import service.UserService;

public interface ServiceAbstractFactory {


    UserService getUserService();
    CarService getCarService();


}
