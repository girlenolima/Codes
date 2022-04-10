package Conn;


import java.util.ArrayList;
import java.util.List;

public class ConnectionPoll {


    private static final ConnectionPoll singleton = new ConnectionPoll();
    public final static int POLL_SIZE = 2;
    private List<Connection> connectionPoll;

    public static ConnectionPoll getInstance() {
        return singleton;
    }

    private ConnectionPoll() {

        System.out.println("Creating Connection Poll");
        connectionPoll = new ArrayList<Connection>();

        for (int i = 0; i < POLL_SIZE; i++) {
            connectionPoll.add(new Connection());
        }

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
