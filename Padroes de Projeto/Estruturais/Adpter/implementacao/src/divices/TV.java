package divices;

import interfaces.HDMI;

public class TV implements HDMI {

    @Override
    public void setImage(String image) {
        System.out.println(">>>>> This is your video : " + image);

    }

    @Override
    public void setSoud(String sound) {
        System.out.println(">>>>> This is your sound : " + sound);
    }
}
