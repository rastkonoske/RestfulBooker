package endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payload.Auth;
import payload.Booking;

import java.time.LocalDate;
import java.util.HashMap;

import static endpoints.Routes.*;
import static io.restassured.RestAssured.given;

public class Endpoints {

    public static Response createToken (HashMap<String, String> payload) {

        return   given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post(auth_url);
    }

    public static Response createBooking (HashMap<String, Object> payload) {

        return   given ()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(create_url);
    }

    public static Response getBookings () {

        return given()
                .when()
                .get(get_list_url);
    }

    public static Response getBookingsByName (String firstname, String lastname) {

        return given()
                .pathParam("firstname", firstname)
                .pathParam("lastname", lastname)
                .when()
                .get(get_name_url);
    }


    public static Response getBooking (String bookingid) {

        return given()
                .accept(ContentType.JSON)
                .pathParam("bookingid", bookingid)
                .when()
                .get(get_url);
    }

    public static Response updateBooking (String bookingid, Auth aPayload, HashMap<String, Object> bPayload) {

        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .cookie(aPayload.getToken())
                .body(bPayload)
                .pathParam("bookingid", bookingid)
                .when()
                .put(update_url);
    }

    public static Response updateBookingByName (String bookingid, Auth aPayload, Booking bPayload) {

        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .cookie(aPayload.getToken())
                .body(bPayload.getFirstname())
                .body(bPayload.getLastname())
                .pathParam("bookingid", bookingid)
                .when()
                .patch(partial_update_url);
    }

    public static Response deleteBooking (String bookingid, Auth aPayload) {

        return given()
                .contentType(ContentType.JSON)
                .cookie(aPayload.getToken())
                .pathParam("bookingid", bookingid)
                .when()
                .delete(delete_url);
    }

    public static Response healthCheck () {

        return given()
                .when()
                .get(ping_url);
    }

}
