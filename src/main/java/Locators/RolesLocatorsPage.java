package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RolesLocatorsPage {
    WebDriver driver;
    public RolesLocatorsPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public WebElement get_create_role_button()
    {
        WebElement create_role = driver.findElement(By.cssSelector("a[class=\"btn btn-primary\"]"));
        return create_role;
    }
    public WebElement get_search()
    {
        WebElement search = driver.findElement(By.cssSelector("input[type=\"search\"]"));
        return search;
    }
    public WebElement get_show_entities()
    {
        WebElement show_entities = driver.findElement(By.cssSelector("select[aria-controls=\"roles\"]"));
        return show_entities;
    }
    public WebElement get_previous_button()
    {
        WebElement previous_button = driver.findElement(By.id("roles_previous"));
        return previous_button;
    }
    public WebElement get_next_button()
    {
        WebElement next_button = driver.findElement(By.id("roles_next"));
        return next_button;
    }
    public WebElement get_edit_button()
    {
        WebElement edit_button = driver.findElement(By.xpath("text()=\"Edit\""));
        return edit_button;
    }
    public WebElement get_delete_button()
    {
        WebElement delete_button = driver.findElement(By.xpath("text()=\"Delete\""));
        return delete_button;
    }
    public WebElement get_home_page()
    {
        WebElement home_page = driver.findElement(By.cssSelector("a[href=\"https://claims.med-right.net\"]"));
        return home_page;
    }
}
