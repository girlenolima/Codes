package model.iphone;

import factory.abstractyFactory.CountryRulesAbstractFactory;

public class IPhone11 extends IPhone{


    public IPhone11(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {

        System.out.println("Hardware list");
        System.out.println("\t - 6.lin Screen");
        System.out.println("\t - A13 Chipset");
        System.out.println("\t - 4GB RAM");
        System.out.println("\t - 256Gb Memory");
    }
}
