package Claim;
import Locators.HomePagelocators;
import Locators.Loginlocators;
import Locators.TitlesLocatorsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserSetup {
    WebDriver driver;
    Loginlocators locator;
    HomePagelocators home;
    TitlesLocatorsPage title;
    LoginPage login;
    @BeforeTest
    public void navigate_Browser()
    {
        driver= new EdgeDriver();
        driver.navigate().to("https://claims.med-right.net/dashboard/login");
        driver.manage().window().maximize();
        new Loginlocators(driver)
                .enter_username("admin@gmail.com")
                .enter_password("admin")
                .click_login_button();
        locator = new Loginlocators(driver);
        home = new HomePagelocators(driver);
        title=new TitlesLocatorsPage(driver);
        login = new LoginPage();
    }
    @AfterTest
    public void close_browser()
    {
        driver.quit();
    }
}
