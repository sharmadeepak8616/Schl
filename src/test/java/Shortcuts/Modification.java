package Shortcuts;

import org.openqa.selenium.WebElement;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Modification {

    private static String patternToGetHour = "\\s*\\$(.+)";

    public static String getPriceWithoutDollar (String line) {
        Pattern pattern = Pattern.compile(patternToGetHour);
        Matcher match = pattern.matcher(line);
        String priceInString = null;
        if(match.find()) {
            priceInString = match.group(1);
        }
        return priceInString;
    }

    public static double stringToDouble (String str) {
        return Double.valueOf(str);
    }

    public static boolean isAttribtuePresent(WebElement element, String attribute) {
        Boolean result = false;
        try {
            String value = element.getAttribute(attribute);
            if (value != null){
                result = true;
            }
        } catch (Exception e) {}

        return result;
    }

    public static int stringToInt (String str) {
        return Integer.valueOf(str);
    }


}
