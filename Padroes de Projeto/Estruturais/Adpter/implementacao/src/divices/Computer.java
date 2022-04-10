package divices;

import interfaces.HDMI;

public class Computer {

    private HDMI port;

    public void connectPort(HDMI screen) {
        System.out.println("Connecting on HDMI port ...");
        this.port = screen;

    }

    public void senImageAndSound(String image, String sound) {

        if (port == null) {
            System.out.println("Connect a HDMI cable first.");

        } else {

            port.setImage(image);
            port.setSoud(sound);

        }

    }

}
