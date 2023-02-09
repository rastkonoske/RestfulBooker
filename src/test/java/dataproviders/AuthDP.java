package dataproviders;

import org.testng.annotations.DataProvider;
import payload.Auth;

import java.util.HashMap;
import java.util.Map;

public class AuthDP {

    @DataProvider (name="AuthDP")
    public static Object[][] provideAuthData () {

        Map<String, String> auth1 = new HashMap<>();
        auth1.put("username", "admin");
        auth1.put("password", "password123");

//        Map<String, String> auth2 = new HashMap<>();
  //      auth2.put("username", "mika");
    //    auth2.put("password", "1234");

        return new Object[][] {
                { auth1 },
      //          { auth2 },
        };
    }
}
