package observers;

public class Wife implements Observer{


    public void partyTime() {
        System.out.println("I will light the candles!!");
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
