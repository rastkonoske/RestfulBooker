package payload;

import java.util.HashMap;

public class Auth {

    private String username;
    private String password;
    private String token;

    public Object AuthMap (String username, String password) {

        HashMap <String, String> map = new HashMap<String, String>();
        map.put("username", username);
        map.put("password", password);
        return map;
    }


    public String getToken() {
        return token;
    }
}
