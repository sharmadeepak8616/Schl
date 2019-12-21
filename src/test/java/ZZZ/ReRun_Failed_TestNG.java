package ZZZ;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ReRun_Failed_TestNG implements IRetryAnalyzer {
    int min = 0;
    int max = 2;

    @Override
    public boolean retry(ITestResult result) {
        if(min<=max) {
            min++;
            return true;
        }
        return false;
    }

    @Test(retryAnalyzer = ReRun_Failed_TestNG.class)
    public void myTestcase() {
        System.out.println("My testcase");
    }

}
