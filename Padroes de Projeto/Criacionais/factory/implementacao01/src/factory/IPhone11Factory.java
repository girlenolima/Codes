package factory;

import model.IPhone;
import model.IPhone11;

public class IPhone11Factory extends IPhoneFactory{

    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
}
