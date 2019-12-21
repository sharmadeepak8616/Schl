package ZZZ.RestAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;
import java.util.HashMap;

public class Drivers {

    public static void main(String[] args)
    {
        getUserProfileUsingRestAssure();
    }

    /**
     * Driver API documentation -> https://ergast.com/mrd/
     */
    public static void getUserProfileUsingRestAssure()
    {
        try
        {
            RestAssured.baseURI = "https://ergast.com/api/f1/2018/circuits.json";
            //RestAssured.baseURI = "https://ergast.com/api";
            //RequestSpecification httpRequest = RestAssured.given();
            //Response response = httpRequest.get("/f1/2018/circuits.json");
            //Response response = httpRequest.get();
            Response response = RestAssured.get();

            System.out.println("body ="+ response.getBody().asString());
            System.out.println(response.getHeaders().asList());
            System.out.println("status ="+ response.getStatusCode());

            JsonPath eachAttribute = response.jsonPath();
            ArrayList<HashMap<String,String>> a = eachAttribute.getJsonObject("MRData.CircuitTable.Circuits.Location");
            System.out.println("Driver Ids : "+eachAttribute.getJsonObject("MRData.CircuitTable.Circuits.Location[0].lat"));
            HashMap<String,String> aObject = a.get(4);
            System.out.println(aObject.get("locality"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }









}
