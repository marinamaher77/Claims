package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class BatchesLocatorsPage {
    WebDriver driver;
    //Locators
    By Create_element = By.xpath("i[text()=\"Create\"]");
    By import_element = By.id("import-btn-title");
    By assign_element = By.cssSelector("button[type=\"submit\"]");
    By assign_to_users_element = By.cssSelector("span[role=\"combobox\"]");
    By filter_button = By.xpath("button[text()=\"Filter\"]");
    By assigned_class = By.id("is_assigned");
    By status_element = By.id("status");
    By search_element = By.cssSelector("input[type=\"search\"]");
    By show_entities_element = By.cssSelector("select[aria-controls=\"service_types\"]");
    By actions_element = By.id("dropdownMenuButton");
    By show_element = By.cssSelector("button[data-toggle=\"modal\"]");
    By previous_button = By.id("service_types_previous");
    By next_button = By.id("service_types_next");
    By home_button = By.cssSelector("a[href=\"https://claims.med-right.net\"]");
    //  Constructor
public BatchesLocatorsPage(WebDriver driver) {this.driver= driver;}
    //Actions
}
