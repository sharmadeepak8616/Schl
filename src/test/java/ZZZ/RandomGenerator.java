package ZZZ;

import org.testng.Assert;

import java.util.Random;

public class RandomGenerator {

    public static void main(String[] args) {

            Random r = new Random();

        for (int i = 0; i < 10 ; i++) {
            //System.out.println(r.nextInt(1 + 1));
        }

        String[] opportunityFilter = {"Spring_Prospect_Opp", "Spring_Booking_Opp", "Spring_Reinstated_Opp", "Spring_Confirmed_Opp",
                "Spring_Fulfillment_Opp", "Spring_Shipped_Opp", "Spring_Won_Opp", "Spring_Closed_Opp",
                "Spring_Cancelled_Opp", "Spring_ProspectLost_Opp", "Fall_Prospect_Opp", "Fall_Booking_Opp",
                "Fall_Reinstated_Opp", "Fall_Confirmed_Opp", "Fall_Fulfillment_Opp", "Fall_Shipped_Opp",
                "Fall_Won_Opp", "Fall_Closed_Opp", "Fall_Cancelled_Opp", "Fall_ProspectLost_Opp"};
        System.out.println("Length : " + opportunityFilter.length);
        for (int i = 0; i < 10 ; i++) {
            System.out.println(r.nextInt(opportunityFilter.length));
        }



    }


}
