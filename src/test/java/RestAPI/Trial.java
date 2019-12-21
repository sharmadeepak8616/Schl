package RestAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Trial {

    public static void main(String[] args)
    {
        getUserProfileUsingRestAssure();
    }

    /**
     *
     * @author Prashanth
     * Below method will trigger GET Request from MyScholastic using REST Assured .
     * It reads the body content.
     */
    public static void getUserProfileUsingRestAssure()
    {
        try
        {
            RestAssured.baseURI = "http://restcountries.eu/rest/v1/name";
            RequestSpecification httpRequest = RestAssured.given();
            Response response = httpRequest.get("/india");

            System.out.println("body ="+ response.getBody().asString());
            System.out.println("status ="+ response.getStatusCode());

            JsonPath eachAttribute = response.jsonPath();
            System.out.println("capital : "+eachAttribute.getJsonObject("capital"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
