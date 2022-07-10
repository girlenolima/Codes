package observers;

public class Sister implements Observer{

    public void partyTime() {
        System.out.println("I will hide");
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


