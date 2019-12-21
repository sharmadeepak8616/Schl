package ZZZ;

import java.util.Map;

public class GetJenkinsParameter {

    public static void main(String[] args) {

        //System.out.println(System.getProperty("abc"));

        //System.out.println(System.getProperty("url"));

        System.out.println(System.getProperty("JAVA_HOME"));

        System.out.println(System.getProperty("OneDrive"));

        String a = System.getProperty("JAVA_HOME");
        System.out.println(a);

        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }


    }







}
