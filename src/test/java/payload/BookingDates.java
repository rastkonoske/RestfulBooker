package payload;

import java.util.Date;
import java.util.HashMap;

public class BookingDates {

    private Date checkin;
    private Date checkout;

    public Object BookingDatesMap (Date checkin, Date checkout) {
        HashMap map = new HashMap<>();
        map.put("checkin", checkin);
        map.put("checkout", checkout);
        return map;
    }


}
