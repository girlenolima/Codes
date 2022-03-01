package factory;

import model.IPhone;
import model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{

    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
}
