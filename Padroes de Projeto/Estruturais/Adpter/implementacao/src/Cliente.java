import adpter.HDMItoOldeMonitorAdpter;
import adpter.HDMItoVGAAdpter;
import divices.Computer;
import divices.OldMonitor;
import divices.TV;

public class Cliente {


    public static void main(String[] args) {

        Computer pc = new Computer();
        TV tv = new TV();

        pc.connectPort(tv);
        pc.senImageAndSound("Cat and rainbow", "Nyan cat song");


       /* System.out.println("-------------------- Monitor --------------------");
        Computer pc2 = new Computer();
        OldMonitor monitor = new OldMonitor();
        pc2.connectPort(new HDMItoVGAAdpter(monitor));
        pc2.senImageAndSound("Cat and rainbow", "Nyan cat song");*/


        System.out.println("-------------------- Monitor --------------------");
        Computer pc3 = new Computer();
        HDMItoOldeMonitorAdpter monitorAdptee = new HDMItoOldeMonitorAdpter();
        pc3.connectPort(monitorAdptee);
        pc3.senImageAndSound("Cat and rainbow", "Nyan cat song");









    }


}
