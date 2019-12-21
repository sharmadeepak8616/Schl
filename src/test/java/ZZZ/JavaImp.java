package ZZZ;

import java.text.DecimalFormat;

public class JavaImp {

    public static void main(String[] args) {

        //String into double
        String str = "1.65";
        Double d = Double.valueOf(str);
        System.out.println(d);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(d));


        String a = "$35.50";


    }


}
