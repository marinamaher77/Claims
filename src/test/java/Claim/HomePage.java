package Claim;
import Locators.Createtitlepagelocators;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class HomePage extends BrowserSetup{
    @Test(priority = 1)
    public void menu_sec() throws InterruptedException {
        home.menu().click();
        Thread.sleep(3000);
    }
    @Test(dependsOnMethods = {"menu_sec"} , alwaysRun = true)
    public void organization_structure() throws InterruptedException {
     home.get_organization().click();
     Thread.sleep(3000);
    }
    @Test(dependsOnMethods = {"menu_sec" , "organization_structure"}, alwaysRun = true)
    public void title() throws InterruptedException {
        home.get_organization_title().click();
        title.click_create_button();
        new Createtitlepagelocators(driver)
        .enter_name("marina").enter_desc("qa").click_save().click_ok().click_titles_page();
         Thread.sleep(30000);
        //title.get_entries();
       //title.click_edit_button();
        //title.click_delete_button();
        //title.click_home_page();
    }
    @Test(dependsOnMethods = {"menu_sec" , "organization_structure"}, alwaysRun = true)
    public void department()
    {
        home.get_department().click();
    }
    @Test(dependsOnMethods = {"menu_sec"} , alwaysRun = true)
    public void provider() throws InterruptedException {
         home.get_provider().click();
         Thread.sleep(3000);
    }
    @Test(dependsOnMethods = {"menu_sec" , "provider"} , alwaysRun = true)
    public void providers_type()
    {
        home.get_provider_types().click();
    }
    @Test(dependsOnMethods = {"menu_sec" , "provider"} , alwaysRun = true)
    public void providers_data()
    {
      home.get_providers().click();
    }
    @Test(dependsOnMethods = {"menu_sec"} , alwaysRun = true)
    public void control() throws InterruptedException {
    home.get_control().click();
      Thread.sleep(3000);
    }
    @Test(dependsOnMethods = {"menu_sec" , "control"} , alwaysRun = true)
    public void roles()
    {
        home.get_roles().click();
    }
    @Test(dependsOnMethods = {"menu_sec" , "control"} , alwaysRun = true)
    public void users()
    {
         home.get_users().click();
    }
    @Test(dependsOnMethods = {"menu_sec"} , alwaysRun = true)
    public void batches()
    {
    home.get_batches().click();
    }
    @Test(dependsOnMethods = {"menu_sec"} , alwaysRun = true)
    public void claims()
    {
     home.get_claims().click();
    }
    @Test
    public void disclaimer() throws InterruptedException {
        home.get_version_disclaimer().click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"mod-primary\"]/div/div/div[2]/div/div[2]/button")).click();
        Thread.sleep(3000);
    }
    @Test
    public void acc_onfo() throws InterruptedException {
        home.get_dropbutton().click();
        Thread.sleep(3000);
        String name= home.get_user_info().getText();
        System.out.println("the user name is : " +name);
        Assert.assertEquals(name,"admin");
        //home.get_settings().click();
        home.logout().click();
    }
}
