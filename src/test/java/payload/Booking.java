package payload;

import java.util.HashMap;

public class Booking {

    private String bookingid;
    private String firstname;
    private String lastname;
    private double totalprice;
    private boolean depositpaid;
    private BookingDates bookingdates;
    private String additionalneeds;

    public Object BookingMap (String firstname, String lastname, double totalprice, boolean depositpaid, BookingDates bookingdates, String additionalneeds) {

        HashMap map = new HashMap<>();
        map.put("firstname", firstname);
        map.put("lastname", lastname);
        map.put("totalprice", totalprice);
        map.put("depositpaid", depositpaid);
        map.put("bookingdates", bookingdates);
        map.put("additionalneeds", additionalneeds);
        return map;
    }

    public String getBookingid() {
        return bookingid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public BookingDates getBookingdates() {
        return bookingdates;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }
}