package factory;

import dataBase.dabaseInterface;

public interface DBFactory {

    dabaseInterface getDatabase();

}
