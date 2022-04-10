package factory.abstractyFactory;

import model.certificate.BrazilianCertificate;
import model.certificate.Certificate;
import model.packing.BrazilianPacking;
import model.packing.Packing;

public class BrazilianRulesAbstract  implements  CountryRulesAbstractFactory{

    @Override
    public Certificate getCertificate() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
