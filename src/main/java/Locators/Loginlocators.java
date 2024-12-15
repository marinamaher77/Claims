package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Loginlocators {
   private WebDriver driver;
    //Locators
    By username_element = By.id("username");
    By password_element = By.id("password");
    By login_button = By.cssSelector("button[type='submit']");
    //Constructor
    public Loginlocators(WebDriver driver)
    {
        this.driver = driver;
    }
    //Actions
    public Loginlocators enter_username(String username)
    {
      driver.findElement(username_element).sendKeys(username);
      return this;
    }
    public Loginlocators enter_password(String password)
    {
        driver.findElement(password_element).sendKeys(password);
        return this;
    }
    public Loginlocators click_login_button()
    {
        driver.findElement(login_button).click();
      return this;
    }
    public Loginlocators clear_elements()
    {
        driver.findElement(username_element).clear();
        driver.findElement(password_element).clear();
        return this;
    }

}
