package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class DepartmentsLocatorsPage {
   WebDriver driver;
    public DepartmentsLocatorsPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public WebElement get_create_button()
    {
        WebElement create_button = driver.findElement(By.cssSelector("a[href=\"https://claims.med-right.net/dashboard/departments/create\"]"));
        return create_button;
    }
    public WebElement get_search()
    {
        WebElement search = driver.findElement(By.cssSelector("input[type=\"search\"]"));
        return search;
    }
    public WebElement get_show_entries()
    {
        WebElement show_entries = driver.findElement(By.cssSelector("select[aria-controls=\"service_types\"]"));
        return show_entries;
    }
    public WebElement get_previous()
    {
        WebElement previous_button = driver.findElement(By.id("service_types_previous"));
        return previous_button;
    }
    public WebElement get_next()
    {
        WebElement next_button = driver.findElement(By.id("service_types_next"));
        return next_button;
    }
    public WebElement get_edit_button()
    {
        WebElement edit_button = driver.findElement(By.xpath("a[text()=\"Edit\"]"));
        return edit_button;
    }
    public WebElement get_delete_button()
    {
        WebElement delete_button = driver.findElement(By.xpath("a[text()=\"Delete\"]"));
        return delete_button;
    }
    public WebElement get_home_page()
    {
        WebElement home_page = driver.findElement(By.cssSelector("a[href=\"https://claims.med-right.net\"]"));
        return home_page;
    }
}
