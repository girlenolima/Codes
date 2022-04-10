import model.Address;
import model.User;

public class Cliente {


    public static void main(String[] args) {


        User user = new User("ORIGINAL",25, new Address("ABC",1000));
        System.out.println(user);


        User clone1 = user.cloneBuilder()
                .withName("CLONE 1")
                .now();
        System.out.println(clone1);

        User clone2 = user.cloneBuilder()
                .withName("CLONE 2")
                .now();
        System.out.println(clone2);

    }


}
