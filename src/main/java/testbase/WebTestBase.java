package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import utility.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class  WebTestBase {
    public static WebDriver driver;
    public Properties properties;
    public WebTestBase() {
        properties = new Properties();
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") +"/src/main/resources/properties/config.properties");
                   } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(fileInputStream);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
            }

    public WebTestBase(WebDriver driver) {
    }

    public void initialization() {
        String browserName = properties.getProperty("browserName");
        if (browserName.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.setBinary(("C:/Users/SOPAN/Downloads/chrome-win64 (1)/chrome-win64/chrome.exe"));
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/main/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver(options);

        } else if (browserName.equalsIgnoreCase("edge")) {
            EdgeOptions edgeOptions = new EdgeOptions();
            // Add any additional Edge options if needed
            System.setProperty("webdriver.edge.driver",System.getProperty("user.dir") +"/src/main/resources/drivers/msedgedriver.exe");
            driver = new EdgeDriver(edgeOptions);
        } else {
            throw new RuntimeException("Please select a correct browser name");
        }
        driver.navigate().to(properties.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility.PAGE_LOAD));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility.IMPLICIT_WAIT));
        driver.manage().deleteAllCookies();

    }

        }

