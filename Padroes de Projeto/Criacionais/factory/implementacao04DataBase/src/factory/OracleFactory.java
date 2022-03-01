package factory;


import dataBase.OracleDB;
import dataBase.dabaseInterface;

public class OracleFactory implements DBFactory {


    @Override
    public dabaseInterface getDatabase() {
        return new OracleDB();
    }
}
