package adpter;

import interfaces.HDMI;
import interfaces.VGA;

public class HDMItoVGAAdpter  implements HDMI{

    private VGA vga;

    public HDMItoVGAAdpter(VGA vga) {
        System.out.println("Conecting the HDMI/VGA adpter");
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI para VGA");
        vga.setImage(image);

    }

    @Override
    public void setSoud(String sound) {
        System.out.println("Sorry , we dont't work with sound");
    }
}
