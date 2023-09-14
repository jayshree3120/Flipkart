package testclass;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbase.WebTestBase;

public class RunFailHomeTest extends WebTestBase {
    public HomePage homePage;
    public RunFailHomeTest() {
        super();
    }
    @BeforeMethod
    public void beforeMethod() {
        homePage.initialization();
        homePage = new HomePage();
    }
    @Test(description = "Search test case to run only failed test case")
    public void RunFailSearchProduct() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closePopUp();
        homePage.searchProduct("Mobile");
        Assert.assertFalse(true);

    }

    /*@AfterMethod
    public void afterMethod(){driver.close();
    }*/
}


