package tests;

import dataproviders.AuthDP;
import dataproviders.BookingDP;
import endpoints.Endpoints;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import payload.Auth;
import payload.Booking;

import java.util.HashMap;

public class Test1 {

    Auth authPayload;
    Booking bookingPayload;

    @BeforeClass
    public void setup() {

        authPayload = new Auth();
        bookingPayload = new Booking();

    }


    @Test (priority = 1, dataProvider="BookingDP", dataProviderClass = BookingDP.class)
    public void testcreateBooking (HashMap <String, Object> map) {

        Response response = Endpoints.createBooking(map);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);

    }

    @Test (priority = 2)
    public void testGetBooking () {

        Response response = Endpoints.getBooking("3791");
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);

    }

    @Test (priority = 3)
    public void testGetBookings () {

        Response response = Endpoints.getBookings();
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);

    }

    @Test (priority = 4)
    public void testGetBookingsByName () {

        Response response = Endpoints.getBookingsByName("Pera", "Peric");
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);

    }

    @Test (priority = 5, dataProvider="AuthDP", dataProviderClass = AuthDP.class)
    public void testCreateToken (HashMap <String, String> map) {
        Response response = Endpoints.createToken(map);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test (priority = 6, dataProvider="BookingDP", dataProviderClass = BookingDP.class)
    public void testUpdateBooking (HashMap <String, Object> map) {

        Response response = Endpoints.updateBooking(bookingPayload.getBookingid(), authPayload, map);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);

    }

    @Test (priority = 7)
    public void testDeleteBooking () {

        Response response = Endpoints.deleteBooking(bookingPayload.getBookingid(), authPayload);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);

    }

    @Test
    public void testPing () {

        Response response = Endpoints.healthCheck();
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 201);

    }

}
