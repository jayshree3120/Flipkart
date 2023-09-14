package testclass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CheckBoxPage;
import pages.HomePage;
import testbase.WebTestBase;

public class CheckboxTest extends WebTestBase {
    public HomePage homePage;
    public CheckBoxPage checkBoxPage;

    public CheckboxTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
        checkBoxPage = new CheckBoxPage();
    }

    @Test(description = "Verify Checkbox Selection")
    public void testCheckboxSelection() {
        SoftAssert softAssert = new SoftAssert();
       checkBoxPage.closeLoginPopup();
        checkBoxPage.clickMobile();
        checkBoxPage.isSamsungCheckboxSelected();
        softAssert.assertTrue(checkBoxPage.isSamsungCheckboxSelected(), "Samsung checkbox is selected.");
        softAssert.assertAll();
    }
    }


