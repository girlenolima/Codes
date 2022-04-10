package factory.abstractyFactory;

import model.certificate.Certificate;
import model.certificate.USCertificate;
import model.packing.Packing;
import model.packing.USPacking;

public class USRulesAbstract implements  CountryRulesAbstractFactory{
    @Override

    public Certificate getCertificate() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return  new USPacking();
    }
}
