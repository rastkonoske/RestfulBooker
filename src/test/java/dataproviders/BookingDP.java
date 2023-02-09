package dataproviders;

import org.testng.annotations.DataProvider;
import java.util.HashMap;
import java.util.Map;

public class BookingDP {

    @DataProvider (name = "BookingDP")
    public static Object[][] provideBookingData() {
        Map<String, Object> booking1 = new HashMap<>();
        booking1.put("firstname", "Pera");
        booking1.put("lastname", "Peric");
        booking1.put("totalprice", 254);
        booking1.put("depositpaid", true);
        Map<String, Object> bookingdates1 = new HashMap<>();
        bookingdates1.put("checkin", "2022-01-01");
        bookingdates1.put("checkout", "2022-01-10");
        booking1.put("bookingdates", bookingdates1);
        booking1.put("additionalneeds", "None");

        Map<String, Object> booking2 = new HashMap<>();
        booking2.put("firstname", "Marko");
        booking2.put("lastname", "Markovic");
        booking2.put("totalprice", 356);
        booking2.put("depositpaid", false);
        Map<String, Object> bookingdates2 = new HashMap<>();
        bookingdates2.put("checkin", "2022-02-01");
        bookingdates2.put("checkout", "2022-02-10");
        booking2.put("bookingdates", bookingdates2);
        booking2.put("additionalneeds", "Breakfast");

        Map<String, Object> booking3 = new HashMap<>();
        booking3.put("firstname", "Marko");
        booking3.put("lastname", "Markovic");
        booking3.put("totalprice", 356);
        booking3.put("depositpaid", false);
        Map<String, Object> bookingdates3 = new HashMap<>();
        bookingdates3.put("checkin", "2022-02-01");
        bookingdates3.put("checkout", "2022-02-10");
        booking3.put("bookingdates", bookingdates3);
        booking3.put("additionalneeds", "Dinner");

        Map<String, Object> booking4 = new HashMap<>();
        booking4.put("firstname", "Janko");
        booking4.put("lastname", "Jankovic");
        booking4.put("totalprice", 472);
        booking4.put("depositpaid", false);
        Map<String, Object> bookingdates4 = new HashMap<>();
        bookingdates4.put("checkin", "2022-02-01");
        bookingdates4.put("checkout", "2022-02-10");
        booking4.put("bookingdates", bookingdates4);
        booking4.put("additionalneeds", "Escort");

        return new Object[][] {
                { booking1 },
                { booking2 },
                { booking3 },
                { booking4 },
        };
    }
}
