package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.ActionUtility;
import utility.Utility;

public class MouseOverPage extends WebTestBase {

    @FindBy(xpath="//button[contains(text(),'✕')]")
    WebElement closeLoginPopup;

    @FindBy(xpath="//span[contains(text(),'Electronics')]")
    WebElement mouseOver;

    @FindBy(xpath="//a[@title='Mobiles']")
    WebElement mobilesSubMenu;

    public MouseOverPage(){
        PageFactory.initElements(driver, this);
    }

    public void closeLoginPopup() {
        Utility.waitUntilElementToBeClickable(closeLoginPopup);
        closeLoginPopup.click();
    }
    public void clickonMobiles() {
        Utility.waitUntilElementToBeClickable(mobilesSubMenu);
        mobilesSubMenu.click();
    }
    public boolean getMobileSubmenuText() {
      ActionUtility.mouseOverAction(mobilesSubMenu);
       return false;
    }
    public void clickonElectronics() {
        Utility.waitUntilElementToBeClickable(mouseOver);
    }
    public void mouseOverAction1() {
    }
}
