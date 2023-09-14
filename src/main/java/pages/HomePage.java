package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class HomePage extends WebTestBase {

    @FindBy(xpath ="//button[@class='_2KpZ6l _2doB4z']")
    WebElement closePopUpElement;

    @FindBy(xpath ="//input[@placeholder='Search for products, brands and more']")
    WebElement searchInput;

    @FindBy(xpath ="//button[@type='submit']")
    WebElement searchResults;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void closePopUp() {
        Utility.waitUntilElementToBeClickable(closePopUpElement);
        closePopUpElement.click();
    }

    public void searchProduct(String productName) {
        Utility.waitUntilElementToBeClickable(searchInput);
        searchInput.sendKeys(productName);
        searchInput.sendKeys(Keys.RETURN);
    }
    public boolean isSearchResultsDisplayed() {
       return Utility.isDisplayedElement(searchResults);
    }

    public void navigateToMobilesPage() {
    }
}
