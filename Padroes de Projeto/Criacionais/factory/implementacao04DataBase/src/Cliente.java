import dataBase.dabaseInterface;
import factory.OracleFactory;

public class Cliente {


    public static void main(String[] args) {

        dabaseInterface oracle = new OracleFactory().getDatabase();
        oracle.query("SELECT * FROM");

    }


}
