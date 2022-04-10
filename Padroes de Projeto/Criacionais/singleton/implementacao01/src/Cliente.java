import Conn.Connection;
import Conn.ConnectionPoll;

public class Cliente {


    public static void doQuery1() {

        ConnectionPoll poll = ConnectionPoll.getInstance();
        Connection conn = poll.getConnection();
        if (conn != null) {
            conn.query("Select * from A1");
        }

        poll.leaveCoonection(conn);
    }

    public static void doQuery2() {

        ConnectionPoll poll = ConnectionPoll.getInstance();
        Connection conn = poll.getConnection();
        if (conn != null) {
            conn.query("Select * from A2");
        }
        poll.leaveCoonection(conn);
    }

    public static void doQuery3() {

        ConnectionPoll poll = ConnectionPoll.getInstance();
        Connection conn = poll.getConnection();
        if (conn != null) {
            conn.query("Select * from A3");
        }
        poll.leaveCoonection(conn);
    }

    public static void main(String[] args) {
        System.out.println("Connection Poll Size " + ConnectionPoll.POLL_SIZE);
        int pol = ConnectionPoll.POLL_SIZE;
        System.out.println(pol);

        doQuery1();
        doQuery2();
        doQuery3();
    }

}
