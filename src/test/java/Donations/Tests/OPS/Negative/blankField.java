package Donations.Tests.OPS.Negative;

import static Donations.Sections.CommonUtils.*;
import Donations.Sections.DonationAmount;
import Donations.Sections.Payments;
import Donations.Sections.PersonalDetails;
import org.testng.annotations.Test;

public class blankField {

    @Test
    public void blankField() throws InterruptedException {

        PersonalDetails personal = new PersonalDetails();
        DonationAmount donation = new DonationAmount();
        Payments payment = new Payments();

        openDonationUsingFullUrl();
        personal.verifyColorAllSubHeading(colorBlackValidField);
        donation.verifyColorAllSubHeading(colorBlackValidField);
        payment.verifyColorAllSubHeading(colorBlackValidField);

        payment.clickCompletePayment();
        payment.verifyErrorMsg(errorMsg);
        payment.checkColorErrorMsg(colorRedInvalidField);

        personal.verifyColorAllSubHeading(colorRedInvalidField);
        donation.verifyColorAllSubHeading(colorRedInvalidField);
        payment.verifyColorAllSubHeadingSkipCardType(colorRedInvalidField);
        payment.checkColorCardType(colorBlackValidField);

        quitDriver();

    }



}
