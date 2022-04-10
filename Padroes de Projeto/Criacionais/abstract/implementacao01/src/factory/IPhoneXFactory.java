package factory;

import factory.abstractyFactory.CountryRulesAbstractFactory;
import model.iphone.IPhone;
import model.iphone.IPhoneX;
import model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory{

    public IPhoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected IPhone createIPhone(String level) {

        if (level.equalsIgnoreCase("standar")) {
            return new IPhoneX(rules);
        } else if (level.equalsIgnoreCase("highEnd")) {
            return new IPhoneXSMax(rules);
        } else {
            return null;
        }



    }
}
