package Claim;
import Locators.Loginlocators;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class LoginPage extends BrowserSetup{
    @Test(priority = 1)
    public void login_with_valid_data()
    {       new Loginlocators(driver)
            .enter_username("admin@gmail.com")
            .enter_password("admin")
            .click_login_button();
           driver.navigate().back();
    }
    @DataProvider(name="invalid_login")
    public Object[][] invalid_login()
    {
        return new Object[][]
                {
                        {"test@gmail.com", "test"}
                };
    }
    @Test(dataProvider = "invalid_login", priority = 2)
    public void login_with_invalid_data(String username , String password) throws InterruptedException {   new Loginlocators(driver).clear_elements().enter_username(username)
        .enter_password(password)
        .click_login_button();
        Thread.sleep(3000);
    }
}
