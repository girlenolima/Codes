package observers;


public class Friend implements Observer {


    public void partyTime() {
        System.out.println("Let's Party!");
        System.out.println("I will turn off the lights!");
    }

    @Override
    public void update(boolean status) {

        if (status) {
            partyTime();
        } else {
            System.out.println("false alarm");
        }


    }


}
