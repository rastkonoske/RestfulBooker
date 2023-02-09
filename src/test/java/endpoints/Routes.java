package endpoints;

public class Routes {

    public static String base_url = "https://restful-booker.herokuapp.com";
    public static String auth_url = base_url+"/auth";
    public static String ping_url = base_url+"/ping";

    public static String get_list_url = base_url+"/booking";
    public static String get_name_url = base_url+"/booking?{firstname}&{lastname}=brown";
    public static String get_url = base_url+"/booking/{bookingid}";
    public static String create_url = base_url+"/booking";
    public static String update_url = base_url+"/booking/{bookingid}";
    public static String partial_update_url = base_url+"/booking/{bookingid}";
    public static String delete_url = base_url+"/booking/{id}";

}
