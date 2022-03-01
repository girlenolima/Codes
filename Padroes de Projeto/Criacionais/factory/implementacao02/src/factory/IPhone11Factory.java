package factory;

import model.*;

public class IPhone11Factory extends IPhoneFactory{

    @Override
    protected IPhone createIPhone(String level) {
        if (level.equalsIgnoreCase("standar")) {
            return new IPhone11();
        } else if (level.equalsIgnoreCase("highEnd")) {
            return new IPhone11Pro();
        } else {
            return null;
        }
    }
}
