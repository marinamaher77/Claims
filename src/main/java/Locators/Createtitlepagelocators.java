package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class Createtitlepagelocators {
    WebDriver driver;
    //Locators
    By name_element = By.id("name");
    By description_element = By.id("desc");
    By save_button = By.xpath("//button[text()=\"Save\"]");
    By confirmation_message = By.className("swal2-confirm");
    By titles_page = By.xpath("/html/body/div[1]/div[3]/div/div/div/div[1]/div[2]/nav/ol/li[2]/a");
    //Constructor
    public Createtitlepagelocators(WebDriver driver)
    {this.driver=driver;}
    //Actions
    public Createtitlepagelocators enter_name(String name)
    {
        driver.findElement(name_element).sendKeys(name);
        return this;
    }
    public Createtitlepagelocators enter_desc(String desc)
    {   driver.findElement(description_element).sendKeys(desc);
        return this;
    }
    public Createtitlepagelocators click_save()
    {   driver.findElement(save_button).click();
        return this;
    }
    public Createtitlepagelocators click_ok()
    {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click()", confirmation_message);
        driver.findElement(confirmation_message).click();
        return this;
    }
    public Createtitlepagelocators click_titles_page()
    {
        driver.findElement(titles_page).click();
        return this;
    }
}
