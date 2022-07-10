import observers.Friend;
import observers.Sister;
import observers.Wife;
import subject.Doorman;

public class Cliente {


    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        doorman.add(new Wife());
        doorman.add(new Friend());
        doorman.add(new Sister());


        System.out.println("Husband is comming");

        doorman.setStatus(false);





    }
}
