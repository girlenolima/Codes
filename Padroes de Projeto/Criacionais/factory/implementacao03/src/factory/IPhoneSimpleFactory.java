package factory;

import model.*;

public class IPhoneSimpleFactory {


    public static IPhone orderIPhone(String generation, String level) {

        IPhone device = null;

        if ("x".equalsIgnoreCase(generation)) {
            if ("standard".equalsIgnoreCase(level)) {
                device = new IPhoneX();
            } else if ("highEnd".equalsIgnoreCase(level)) {
                device = new IPhoneXSMax();
            }

        } else if ("11".equalsIgnoreCase(generation)) {
            if ("standard".equalsIgnoreCase(level)) {
                device = new IPhone11();
            } else if ("highEnd".equalsIgnoreCase((level))) {
                device = new IPhone11Pro();
            }
        }

        if(device != null){
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }
        return device;
    }

}
