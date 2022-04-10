package conn;


import java.util.ArrayList;
import java.util.List;

public class ConnectionPoll {


    public final static int POLL_SIZE = 2;
    private static List<Connection> connectionPoll;


    //Estudar depois, bloco de inicializaçao estatico
    static{
        System.out.println("Creating Connection Poll");
        connectionPoll = new ArrayList<Connection>();
        for (int i = 0; i < POLL_SIZE; i++) {
            connectionPoll.add(new Connection());
        }
    }
    public ConnectionPoll() {
        System.out.println("New instance of Connection Pool");
    }

    public Connection getConnection() {
        Connection avaiable = null;

        for (Connection conn : connectionPoll) {
            if (!conn.isInUse()) {
                avaiable = conn;
                break;
            }
        }

        if (avaiable == null) {
            System.out.println("No connections avaiable");
            return null;
        }
        avaiable.setInUse(true);
        return avaiable;
    }

    public void leaveCoonection(Connection conn) {

        conn.setInUse(false);
    }



}
