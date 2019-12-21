package ZZZ;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class VerifyLinks {

    public static void main(String[] args) {

        String checkUrl = "https://www.google.com";

        try {
           URL url = new URL(checkUrl);

            HttpURLConnection http = (HttpURLConnection)url.openConnection();

            http.setConnectTimeout(5000);

            http.connect();

            System.out.println(http.getResponseCode() + " -- " + HttpURLConnection.HTTP_OK);

            System.out.println(http.getResponseMessage());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
