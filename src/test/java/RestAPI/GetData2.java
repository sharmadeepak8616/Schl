package RestAPI;

//import static io.restassured.RestAssured.*;
//import static io.hamcrest.Matchers.*;
//import io.restassured.path.json.JsonPath;
//import io.restassured.response.Response;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.*;

public class GetData2 {

    public static void main(String[] args) {

        //String url = "http://restcountries.eu/rest/v1/name/india";
        String url = "http://ergast.com/api/f1/drivers.json";
        String url1 = "http://ergast.com/api/f1/2017/circuits.json";

        Response resp = get(url);
        int code = resp.getStatusCode();
        System.out.println("Status code : " + code + "\n");

        String data = resp.asString();

        System.out.println(data);

        JsonPath json = new JsonPath(data);

        //System.out.println("Name : " + json.getList("MRData.total"));


        try {
            given().
                    when().get(url).
                    then().
                    assertThat().
                    body("MRData.total", equalTo("847"));
        } catch (Exception e) {
            System.out.println("No such element :)");
        }


        //get("").then().body("/capital", equalTo("New Delhi"));








    }





}
