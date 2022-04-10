import factory.IPhone11Factory;
import factory.IPhoneFactory;
import factory.IPhoneXFactory;
import factory.abstractyFactory.BrazilianRulesAbstract;
import factory.abstractyFactory.CountryRulesAbstractFactory;
import model.iphone.IPhone;
import model.iphone.IPhone11;

public class Cliente {

    public static void main(String[] args) {

        CountryRulesAbstractFactory rules = new BrazilianRulesAbstract();
        IPhoneFactory genX = new IPhoneXFactory(rules);
        IPhoneFactory gen11 = new IPhone11Factory(rules);

        System.out.println("\n\n ### Ordering an IPhone X");
        IPhone iPhone = genX.orderIPhone("standar");
        System.out.println(iPhone);

        System.out.println("\n\n ### Ordering an IPhone 11 HignEnd");
        IPhone iPhone1 = gen11.orderIPhone("highEnd");
        System.out.println(iPhone1);







    }
}
