package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePagelocators {
    WebDriver driver;
    public HomePagelocators(WebDriver driver)
    {
        this.driver= driver;
    }
    public WebElement get_version_disclaimer()
    {
        WebElement disclaimer = driver.findElement(By.cssSelector("button[data-toggle='modal']"));
        return disclaimer;
    }
    public WebElement get_dropbutton()
    {
        WebElement img_acc=driver.findElement(By.cssSelector("img[alt='Avatar']"));
        return img_acc;
    }
    public WebElement get_user_info()
    {
        WebElement userinfo= driver.findElement(By.cssSelector("div[class=\"user-name\"]"));
        return userinfo;
    }
    public WebElement get_account()
    {
        WebElement account = driver.findElement(By.cssSelector("span[class='icon mdi mdi-face']"));
        return account;
    }
    public WebElement get_settings()
    {
        WebElement settings = driver.findElement(By.cssSelector("a[class='dropdown-item']"));
        return settings;
    }
    public WebElement logout()
    {
        WebElement logout = driver.findElement(By.cssSelector("form[method='post']"));
        return logout;
    }
    public WebElement get_page_title()
    {
        WebElement title = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[1]/a[2]/img"));
        return title;
    }
    public WebElement menu()
    {
        WebElement menu_sectio = driver.findElement(By.cssSelector("span[class=\"icon mdi mdi-menu\"]"));
        return menu_sectio ;
    }
   public WebElement get_organization()
   {
       WebElement organization_structure_dropdown=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div[1]/ul/li[3]/a/span"));
     return organization_structure_dropdown;
   }
   public WebElement get_organization_title()
   {
       WebElement org_title= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div[1]/ul/li[3]/ul/li[1]/a"));
       return org_title;
   }
   public WebElement get_department()
   {
       WebElement department = driver.findElement(By.cssSelector("a[href=\"https://claims.med-right.net/dashboard/departments\"]"));
       return department;

   }
  public WebElement get_provider()
  {
      WebElement provider = driver.findElement(By.xpath("//span[text()=\"Providers\"]"));
      return provider;
  }
  public WebElement get_provider_types()
  {
      WebElement provider_types = driver.findElement(By.xpath("//a[text()=\"Provider Types\"]"));
      return provider_types;
  }
   public WebElement get_providers()
   {
       WebElement prov_data = driver.findElement(By.xpath("//a[text()=\"Providers\"]"));
       return prov_data;
   }
   public WebElement get_control()
   {
       WebElement control_button = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div[1]/ul/li[5]/a/span"));
       return control_button;
   }
   public WebElement get_roles()
   {
       WebElement roles = driver.findElement(By.xpath("//a[text()=\"Roles\"]"));
       return roles;
   }
   public WebElement get_users()
   {
       WebElement users = driver.findElement(By.xpath("//a[text()=\"Users\"]"));
       return users;
   }
   public WebElement get_batches()
   {
       WebElement batches = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div[1]/ul/li[6]/a"));
       return batches;
   }
   public WebElement get_claims()
   {
       WebElement claim = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div[1]/ul/li[7]/a"));
       return claim;
   }
}
