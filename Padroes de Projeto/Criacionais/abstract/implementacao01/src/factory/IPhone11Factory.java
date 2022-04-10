package factory;

import factory.abstractyFactory.CountryRulesAbstractFactory;
import model.iphone.IPhone;
import model.iphone.IPhone11;
import model.iphone.IPhone11Pro;
import model.iphone.IPhoneXSMax;

public class IPhone11Factory extends IPhoneFactory{

    public IPhone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected IPhone createIPhone(String level) {

        if (level.equalsIgnoreCase("standar")) {
            return new IPhone11(rules);
        } else if (level.equalsIgnoreCase("highEnd")) {
            return new IPhone11Pro(rules);
        } else {
            return null;
        }



    }
}
