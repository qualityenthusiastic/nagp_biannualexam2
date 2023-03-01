package baseClass;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.ITestResult;
import org.testng.annotations.*;



public class BaseClass {

    protected static SoftAssert softAssert;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite()
    {
        softAssert = new SoftAssert();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result) {
  /*      if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS,"Status is Passed");
        }else if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL,"Status is Failed");
        }else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP,"Status is Skipped");
        }else{
            test.log(Status.WARNING,"Status is Unknown");
        }*/
    }
}
