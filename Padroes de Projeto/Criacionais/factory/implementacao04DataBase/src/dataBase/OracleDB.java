package dataBase;

public class OracleDB implements dabaseInterface {

    public void query(String sql) {
        System.out.println("Querying " + sql + "in Oracle database");
    }

    public void update(String sql) {
        System.out.println("Update querry " + sql + "in Oracle database");
    }


}
