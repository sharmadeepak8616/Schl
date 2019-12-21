package ZZZ;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class DateVerification_2 {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat newformat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        SimpleDateFormat yearFormat = new SimpleDateFormat("YYYY");
        String opportunityName = "F17";
        String fairEndDate = "08/09/2020";

        Date currentDate = new Date();
        String originalFairYear = yearFormat.format(currentDate);
        System.out.println("Current Date : " + newformat.format(currentDate));
        Calendar cl = Calendar.getInstance();
        cl.add(Calendar.YEAR, 2);
        Date newDate1 = cl.getTime();
        System.out.println("2 year period ends : " + newformat.format(newDate1));

        Date fairDate= newformat.parse(fairEndDate);
        System.out.println("Fair date : " + newformat.format(fairDate));
        String cloneDate = "";
        if (opportunityName.startsWith("F")) {
            String lastDate = "31/07/"+(Integer.valueOf(originalFairYear)+2);
            System.out.println("Last date : " + lastDate);
            Date lastDateObject = newformat.parse(lastDate);
            while (true) {
                long random = ThreadLocalRandom.current().nextLong(fairDate.getTime(), lastDateObject.getTime());
                Date newDate = new Date(random);
                if (Integer.valueOf(monthFormat.format(newDate)) < 8 && newDate.before(lastDateObject)) {
                    cloneDate = newformat.format(newDate);
                    break;
                }
            }
        } else if (opportunityName.startsWith("S")) {
            String lastDate = "31/12/"+(Integer.valueOf(originalFairYear)+2);
            System.out.println("Last date : " + lastDate);
            Date lastDateObject = newformat.parse(lastDate);
            while (true) {
                long random = ThreadLocalRandom.current().nextLong(fairDate.getTime(), lastDateObject.getTime());
                Date newDate = new Date(random);
                if (Integer.valueOf(monthFormat.format(newDate)) >= 8 && newDate.before(lastDateObject)) {
                    cloneDate = newformat.format(newDate);
                    break;
                }
            }
        }
        System.out.println("Clone date : " + cloneDate);





    }



}
