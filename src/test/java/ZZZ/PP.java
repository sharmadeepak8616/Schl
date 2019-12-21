package ZZZ;

import org.joda.time.*;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PP {


    public static void main(String[] args) {
/*

        String[] names = {"Alpha" , "Beta" , "child" , "dump"}; //4
        //int i = 0;

        for (int i=0 ; i < names.length ;i++) {
            System.out.println(names[i]);
        }
*/
/*

        //Print 1- 10
        int count = 1;
        while (count<=10) {
            System.out.println(count);
            count++;
        }
*/
/*

        //Print odd between 1-10
        int count = 1;
        while (count <= 10) {
            if (count % 2 != 0) {
                System.out.println(count);
            }
            count++;
        }
        //1 3 5 7 9
        for (int x = 0 ; x <= 10 ; x+=2) {
            System.out.println(x);
        }
*/

        //Reverse a string
        //Create an abbreviation

/*

        String pp = "Imad";         //damI
        String ppt = "";                    // 0     1     2     3
        String[] ppa = pp.split(""); //{"I" , "m" , "a" , "d"}
        int ppl = ppa.length;               //4
        for (int i = ppl-1 ; i>=0 ; i--) {
            ppt = ppt + ppa[i];
        }
        System.out.println(ppt);
*/
/*

        String name = "level"; // ailiY  Hint: for loop 4
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
*/

/*
        //Fibocanni Series
        //1 1 2 3 5 8 13 21
        //3 3 6 9 15 24 39 63
        int start = 10;
        int totalNumber = 8;
*/





/*

        String message = "Thanks God Its Friday Again";
        String abbreviation = "";
        String[] newMessage = message.split(" ");

        abbreviation = abbreviation + newMessage[0].substring(0,1);
        abbreviation = abbreviation + newMessage[1].substring(0,1);
        abbreviation = abbreviation + newMessage[2].substring(0,1);
        abbreviation = abbreviation + newMessage[3].substring(0,1);
        abbreviation = abbreviation + newMessage[4].substring(0,1);
        System.out.println(abbreviation);
*/

/*
        String name = "  Happy   new      year"; //HNY
        String name1 = "";
        String[] abr = name.trim().split(" "); //{"Happy" , "new" , "year" , "very" , "much"} lastIndex=4 ; length=5

        System.out.println(Arrays.toString(abr)); //shortcut to print an array to see its value

        for (int i=0 ; i < abr.length ; i++) {
            if (abr[i].length() > 0) {
                name1 = name1 + abr[i].substring(0,1);
            }
        }
        System.out.println(name1.toUpperCase());
*/



//level
//make it's reverse / equals

/*

        PP p = new PP();
        p.getClassname();
*/

/*

        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String time = sdf.format(now);
        System.out.println(time);

        Calendar birthDay = new GregorianCalendar(2018, 0, 1);
        Calendar today = new GregorianCalendar();
        today.setTime(new Date());

        double yearsInBetween = today.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
        System.out.println("Years : " + yearsInBetween);

        LocalDate jamesBirthDay = new LocalDate(2018, 1, 1);
        LocalDate now1 = new LocalDate(2019, 1, 2);
        LocalDate n = new LocalDate();
        System.out.println("N is : " + n);

        int monthsBetween = Months.monthsBetween(jamesBirthDay, now1).getMonths();
        double yearsBetween = Years.yearsBetween(jamesBirthDay, now1).getYears();
        int days = Days.daysBetween(jamesBirthDay, now1).getDays();

        System.out.println(yearsBetween + " : " + monthsBetween + " : " + days);


        Period p = new Period(jamesBirthDay, now1);
        System.out.println(p.getYears());

*/
/*

        DateTime start = new DateTime(2018,1,31,0,0);
        DateTime now2 = new DateTime();
        System.out.println(Years.yearsBetween(start, now2).toString());
*/


        DateTime start = new DateTime(2018, 8, 1, 0, 0);
        DateTime stop = new DateTime(2019, 6, 30, 0, 0);

        DateTime now = new DateTime(2019,   1, 31, 0 ,0 );

        DateTime now2 = new DateTime(2018,   7, 31, 0 ,0 );
        DateTime now3 = new DateTime(2018,   8, 1, 0 ,0 );
        DateTime now4 = new DateTime(2018,   8, 2, 0 ,0 );

        DateTime now5 = new DateTime(2019,   6, 29,0 ,0 );
        DateTime now6 = new DateTime(2019,   6, 30, 0 ,0 );
        DateTime now7 = new DateTime(2019,   7, 1, 0 ,0 );

        System.out.println((now.isEqual(start) || now.isAfter(start)) && (now.isEqual(stop) || now.isBefore(stop)));

        System.out.println((now2.isEqual(start) || now2.isAfter(start)) && (now2.isEqual(stop) || now2.isBefore(stop)));
        System.out.println((now3.isEqual(start) || now3.isAfter(start)) && (now3.isEqual(stop) || now3.isBefore(stop)));
        System.out.println((now4.isEqual(start) || now4.isAfter(start)) && (now4.isEqual(stop) || now4.isBefore(stop)));

        System.out.println((now5.isEqual(start) || now5.isAfter(start)) && (now5.isEqual(stop) || now5.isBefore(stop)));
        System.out.println((now6.isEqual(start) || now6.isAfter(start)) && (now6.isEqual(stop) || now6.isBefore(stop)));
        System.out.println((now7.isEqual(start) || now7.isAfter(start)) && (now7.isEqual(stop) || now7.isBefore(stop)));
        //System.out.println((now.isEqual(stop) || now.isBefore(stop)) ;



        String patternToGetLowHighTemp = "Placed\\s*:\\s*(.*)-(.*)-(.*)";
        Pattern r = Pattern.compile(patternToGetLowHighTemp);
        // Now create matcher object.
        Matcher m = r.matcher("Placed : 2019-01-11");
        if (m.find( )) {
            System.out.println(m.group(1) + m.group(2) + m.group(3));
        }







































    }


    public String getClassname() {
        return this.getClass().getSimpleName();
    }



}
