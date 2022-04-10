import aplication.UserRest;

import java.util.HashMap;
import java.util.Map;

public class Cliente {


    public static void main(String[] args) {

        UserRest userRestAPI = new UserRest();
        Map<String, String> body = new HashMap<String,String>();
        body.put("email","user1.com");
        body.put("name","user1");
        body.put("password","user1com");
        Integer staInt = userRestAPI.post(body);
        System.out.println(staInt);


        staInt = userRestAPI.get();
        System.out.println(staInt);



    }
}
