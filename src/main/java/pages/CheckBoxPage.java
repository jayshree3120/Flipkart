package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class CheckBoxPage extends WebTestBase {

    @FindBy(xpath ="//button[@class='_2KpZ6l _2doB4z']")
    public WebElement closePopUpElement;

    @FindBy(xpath ="//div[contains(text(),'Mobiles')]")
    public WebElement mobileOption;

    @FindBy(xpath ="//button[@class='_2KpZ6l _2doB4z']")
    public WebElement samsungCheckbox;

    public CheckBoxPage() {
        super();
        PageFactory.initElements(driver, this);
    }
    public void closeLoginPopup() {
        Utility.waitUntilElementToBeClickable(closePopUpElement);
        closePopUpElement.click();
    }
    public void clickMobileOption() {
        Utility.waitUntilElementToBeClickable(mobileOption);
        mobileOption.click();
    }
    public void clickSamsungCheckbox() {
        Utility.waitUntilElementToBeClickable(samsungCheckbox);
        samsungCheckbox.click();
    }
    public boolean isSamsungCheckboxSelected() {
        return samsungCheckbox.isSelected();
    }
    public void clickMobile() {

    }
}
