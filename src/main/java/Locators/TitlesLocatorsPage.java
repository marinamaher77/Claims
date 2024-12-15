package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class TitlesLocatorsPage {
     WebDriver driver;
    //Locators
    By main_menu_element = By.cssSelector("span[class=\"icon mdi mdi-menu\"]");
    By organization_structure_element = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div[1]/ul/li[3]/a/span");
    By title_element= By.xpath("//a[text()=\"Titles\"]");
    By create_element = By.cssSelector("a[class=\"btn btn-primary\"]");
    By search_element = By.cssSelector("input[type=\"search\"]");
    By show_entries_element = By.cssSelector("select[aria-controls=\"service_types\"]");
    By previous_element = By.id("service_types_previous");
    By next_element = By.id("service_types_next");
    By edit_button_element = By.xpath("//a[text()=\"Edit\"]");
    By delete_button_element = By.xpath("//a[text()=\"Delete\"]");
    By home_page_element = By.xpath("//a[text()=\"\n" +
            "                                    Home\"]");
    //Constructor
    public TitlesLocatorsPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //Actions
    public TitlesLocatorsPage click_create_button()
    {
        driver.findElement(create_element).click();
        return this;
    }
    public TitlesLocatorsPage enter_data_in_search()
    {
        driver.findElement(search_element).sendKeys("test");
        return this;
    }
    public TitlesLocatorsPage get_entries()
    {
        String entities_count =  driver.findElement(show_entries_element).getText();
        System.out.println("entities count is:" + entities_count);
        return this;
    }
    public TitlesLocatorsPage click_previous_button()
    {
        driver.findElement(previous_element).click();
        return this;
        }
        public TitlesLocatorsPage click_next_button()
        {
            driver.findElement(next_element).click();
            return this;
        }
        public TitlesLocatorsPage click_edit_button()
        {
            driver.findElement(edit_button_element).click();
            return this;
        }
        public TitlesLocatorsPage click_delete_button()
        {
            driver.findElement(delete_button_element).click();
            return this;
        }
        public TitlesLocatorsPage click_home_page()
        {
          driver.findElement(home_page_element).click();
            return this;
        }
        public TitlesLocatorsPage click_main_menu()
        {
            driver.findElement(main_menu_element).click();
            return this;
        }
        public TitlesLocatorsPage click_organization_structure()
        {
            driver.findElement(organization_structure_element).click();
            return this;
        }
        public TitlesLocatorsPage click_title()
        {
            driver.findElement(title_element).click();
            return this;
        }
    }

