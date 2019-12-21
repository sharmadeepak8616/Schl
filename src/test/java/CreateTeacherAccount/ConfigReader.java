package CreateTeacherAccount;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private String url;
    private String stgurl;
    private String produrl;
    private String chromeDriverPath;
    private String sauceUsername;
    private String sauceKey;
    private String environment;
    private String sauceBrowser;
    private String platform;
    private String version;
    private String greeting;
    private String firstname;
    private String lastname;
    private String email;
    private String emailNontax;
    private String emailTest;
    private String password;
    private String zip;
    private String role1;
    private String role2;
    private String students;
    private String level;
    private String q1;
    private String q2;
    private String q3;
    private String zipnontax;
    private String ziptest;
    private String numberOfTeacherAccount;
    private String random;
    private String emailStartForTax;
    private String emailStartForNonTax;
    private String emailStartForTest;
    private String firefoxDriverPath;

    public ConfigReader() {

        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            this.url = prop.getProperty("url");
            this.chromeDriverPath = prop.getProperty("chrome_driver_path");
            this.sauceUsername = prop.getProperty("sauce_username");
            this.sauceKey = prop.getProperty("sauce_key");
            this.environment = prop.getProperty("run_test");
            this.sauceBrowser = prop.getProperty("browser");
            this.platform = prop.getProperty("platform");
            this.version = prop.getProperty("version");
            this.greeting = prop.getProperty("greeting");
            this.firstname = prop.getProperty("firstname");
            this.lastname = prop.getProperty("lastname");
            this.email = prop.getProperty("email");
            this.emailNontax = prop.getProperty("emailNontax");
            this.emailTest = prop.getProperty("emailTest");
            this.password = prop.getProperty("password");
            this.zip = prop.getProperty("zip");
            this.role1 = prop.getProperty("role1");
            this.role2 = prop.getProperty("role2");
            this.students = prop.getProperty("students");
            this.level = prop.getProperty("level");
            this.q1 = prop.getProperty("q1");
            this.q2 = prop.getProperty("q2");
            this.q3 = prop.getProperty("q3");
            this.zipnontax = prop.getProperty("zipnontax");
            this.ziptest=prop.getProperty("ziptest");
            this.numberOfTeacherAccount=prop.getProperty("numberOfTeacherAccount");
            this.random=prop.getProperty("random");
            this.emailStartForTax=prop.getProperty("emailStartForTax");
            this.emailStartForNonTax=prop.getProperty("emailStartForNonTax");
            this.emailStartForTest=prop.getProperty("emailStartForTest");
            this.stgurl=prop.getProperty("stgurl");
            this.produrl=prop.getProperty("produrl");
            this.firefoxDriverPath=prop.getProperty("firefoxDriverPath");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getUrl() {
        return url;
    }

    public String getStgUrl() {
        return stgurl;
    }

    public String getProdUrl() {
        return produrl;
    }

    public String getNumberOfTeacherAccount() {
        return numberOfTeacherAccount;
    }

    public String getChromeDriverPath() {

        return chromeDriverPath;
    }

    public String getSauceUsername() {
        return sauceUsername;
    }

    public String getSauceKey() {
        return sauceKey;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getSauceBrowser() {
        return sauceBrowser;
    }

    public String getPlatform() {
        return platform;
    }

    public String getVersion() {
        return version;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getEmailNontax() {
        return emailNontax;
    }

    public String getEmailTest() {
        return emailTest;
    }

    public String getPassword() {
        return password;
    }

    public String getZip() {
        return zip;
    }

    public String getRole1() {
        return role1;
    }

    public String getRole2() {
        return role2;
    }

    public String getStudents() {
        return students;
    }

    public String getLevel() {
        return level;
    }

    public String getQ1() {
        return q1;
    }

    public String getQ2() {
        return q2;
    }

    public String getQ3() {
        return q3;
    }

    public String getZipNonTax() {
        return zipnontax;
    }

    public String getZipTest() {
        return ziptest;
    }

    public String getRandom() {
        return random;
    }

    public String getEmailStartForTax() {
        return emailStartForTax;
    }

    public String getEmailStartForNonTax() {
        return emailStartForNonTax;
    }

    public String getEmailStartForTest() {
        return emailStartForTest;
    }

    public String getFirefoxDriverPath() { return firefoxDriverPath;}

}
