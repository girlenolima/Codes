package factory;

import model.IPhone;
import model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory{


    @Override
    protected IPhone createIPhone() {
        return new IPhoneXSMax();
    }


}
