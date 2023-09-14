package testclass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {
    public HomePage homePage;
    public HomeTest() {
        super();
    }
    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
    }
    @Test(description = "Verify Search Product On HomePage")
    public void VerifySearchProductOnHomePage() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closePopUp();
        homePage.searchProduct("Laptop");
        softAssert.assertTrue(homePage.isSearchResultsDisplayed(), "Search results should be displayed");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
