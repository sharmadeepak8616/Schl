package RestAPI;

import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetData {

    public static void main(String[] args) {

        String url = "http://restcountries.eu/rest/v1/name/india";

        Response resp = get(url);
        int code = resp.getStatusCode();
        System.out.println("Status code : " + code + "\n");

        String data = resp.asString();

        System.out.println(data);

        JsonPath json = new JsonPath(data);

        System.out.println("Name : " + json.getList("name").get(1));

        //get("").then().body("/capital", equalTo("New Delhi"));








    }





}
