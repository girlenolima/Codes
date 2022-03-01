package factory;

import dataBase.PostegreDB;
import dataBase.dabaseInterface;

public class PostegresFactory implements  DBFactory{
    @Override
    public dabaseInterface getDatabase() {

        return new PostegreDB();

    }
}
