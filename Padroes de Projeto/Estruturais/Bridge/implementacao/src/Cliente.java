import dao.UserMongoDBDao;
import dao.UserOracleDao;
import dao.UserPostegresDao;
import model.User;
import services.UserEJB;
import services.UserRest;
import services.UserService;
import services.UserSoap;

public class Cliente {

    public static void main(String[] args) {

        User user = new User("User","user@email","passwd");

        UserService userRestOracleService = new UserRest( new UserOracleDao());
        userRestOracleService.save(user);

        UserService userEJBMongoService = new UserEJB( new UserMongoDBDao());
        userEJBMongoService.save(user);

        UserService userSoapPostegresService = new UserSoap( new UserPostegresDao());
        userSoapPostegresService.save(user);

    }
}
