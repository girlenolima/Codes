
import factory.IPhoneSimpleFactory;
import model.IPhone;

public class Cliente {


    public static void main(String[] args) {


        System.out.println("\n\n ### Ordering an IPhone X");
        IPhone iPhone = IPhoneSimpleFactory.orderIPhone("x","standard");
        System.out.println(iPhone);

        System.out.println("\n\n ### Ordering an IPhone 11");
        IPhone iPhone2 = IPhoneSimpleFactory.orderIPhone("11","standard");
        System.out.println(iPhone2);





    }



}
