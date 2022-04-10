package adpter;

import divices.OldMonitor;
import interfaces.HDMI;

public class HDMItoOldeMonitorAdpter extends OldMonitor implements HDMI{


    public HDMItoOldeMonitorAdpter() {
        super();
        System.out.println("Wrapping the VGAs OldMOnitor interface with a HDMI adpter");
    }


    @Override
    public void setSoud(String soud) {
        System.out.println("Sorry , we dont't work with sound");

    }


}
