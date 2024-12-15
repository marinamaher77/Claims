package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ClaimsLocatorsPage {
     WebDriver driver;
    //  Locators
    By create_element = By.xpath("i[text()=\" Create\"]");
    By import_element = By.id("import-btn-title");
    By assign_element = By.cssSelector("button[type=\"submit\"]");
    By filter_element = By.xpath("button[text()=\"Filter\"]");
    By search_element = By.cssSelector("input[type=\"search\"]");
    By combobx_element = By.cssSelector("span[role=\"combobox\"]");
    By assigned_element = By.cssSelector("select[name=\"is_assigned\"]");
    By status_element = By.id("status");
    By show_entries = By.cssSelector("select[aria-controls=\"service_types\"]");
    By action_element = By.id("dropdownMenuButton");
    By show_element = By.xpath("button[text()=\"Show\"]");
    By previous_element = By.id("service_types_previous");
    By next_element = By.id("service_types_next");
    By home_element = By.cssSelector("a[href=\"https://claims.med-right.net\"]");
    //Constructor
    public ClaimsLocatorsPage(WebDriver driver)
    {this.driver=driver;}
//Actions
}
