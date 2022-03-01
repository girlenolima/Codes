package factory;

import dataBase.MySqlDB;
import dataBase.dabaseInterface;

public class MySqlFactory implements DBFactory{


    @Override
    public dabaseInterface getDatabase() {
        return new MySqlDB();
    }
}
