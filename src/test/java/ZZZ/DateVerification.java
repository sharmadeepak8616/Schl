package ZZZ;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateVerification {

    public static void main(String[] args) {

        String opportunityName = "F19";
        Date date = new Date();
        System.out.println("Current Date " + date);
        SimpleDateFormat newformat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        Calendar cl = Calendar.getInstance();
        cl.add(Calendar.DAY_OF_MONTH, 30);
        Date newDate = cl.getTime();
        System.out.println("Suggested clone date : " + newformat.format(newDate));
        String cloneDate = newformat.format(newDate);
        if (opportunityName.startsWith("S")) {
            if (Integer.valueOf(monthFormat.format(newDate)) >= 8 ) {
                cl.add(Calendar.DAY_OF_MONTH, -30);
                cl.add(Calendar.YEAR, 1);
                cloneDate = newformat.format(cl.getTime());
            } else {
                //cloneDate = newformat.format(newDate);
            }
        } else if (opportunityName.startsWith("F")) {
            if (Integer.valueOf(monthFormat.format(newDate)) < 8 ) {
                cl.add(Calendar.DAY_OF_MONTH, -30);
                cl.add(Calendar.YEAR, 1);
                cloneDate = newformat.format(cl.getTime());
            } else {
                //cl.add(Calendar.DAY_OF_MONTH, 30);
                //cloneDate = newformat.format(cl.getTime());
            }
        }
        System.out.println("Clone date : " + cloneDate);





    }



}
