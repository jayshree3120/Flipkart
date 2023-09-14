package testclass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.MouseOverPage;
import testbase.WebTestBase;

public class MouseOverTest extends WebTestBase {

    public HomePage homePage;
    public MouseOverPage mouseOverPage;

    public MouseOverTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        mouseOverPage = new MouseOverPage();
    }

    @Test(description = "verify MouseOver Action")
    public void verifyMouseOverAction() {
        SoftAssert softAssert = new SoftAssert();
        mouseOverPage.mouseOverAction1();
        mouseOverPage.clickonElectronics();
        softAssert.assertEquals(mouseOverPage.getMobileSubmenuText(),"Mobile", "Mobile submenu should be displayed");
    }

    @AfterMethod
    public void afterMethod() {
                driver.close();
    }
}
