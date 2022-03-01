package factory;

import model.IPhone;
import model.IPhoneX;
import model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {

        if (level.equalsIgnoreCase("standar")) {
            return new IPhoneX();
        } else if (level.equalsIgnoreCase("highEnd")) {
            return new IPhoneXSMax();
        } else {
            return null;
        }


    }
}
