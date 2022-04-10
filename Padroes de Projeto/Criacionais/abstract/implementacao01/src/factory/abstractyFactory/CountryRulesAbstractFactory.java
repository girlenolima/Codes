package factory.abstractyFactory;

import model.certificate.Certificate;
import model.packing.Packing;

public interface CountryRulesAbstractFactory {

    Certificate getCertificate();
    Packing getPacking();

}
