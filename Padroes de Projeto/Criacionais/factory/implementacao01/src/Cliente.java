import factory.IPhone11Factory;
import factory.IPhoneFactory;
import factory.IPhoneXFactory;
import model.IPhone;

public class Cliente {


    public static void main(String[] args) {


        IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
        IPhoneFactory iPhone11Factory = new IPhone11Factory();


        System.out.println("\n\n ### Ordering an IPhone X");
        IPhone iPhone = iPhoneXFactory.orderIPhone();
        System.out.println(iPhone);

        System.out.println("\n\n ### Ordering an IPhone 11 HignEnd");
        IPhone iPhone1 = iPhone11Factory.orderIPhone();
        System.out.println(iPhone1);


    }

}
