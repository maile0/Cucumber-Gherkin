package MyStepsDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

public class loginSteps {

    public WebDriver driver;
    public LoginPage lp;


    @Given("User launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        lp = new LoginPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) throws InterruptedException {
        driver.get(url);
        //driver.manage().window().fullscreen();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        Thread.sleep(2000);
    }

    @When("User clicks on Login button")
    public void user_clicks_on_login_button() {
        lp.clickLoginButton();
    }

    @When("User enters Username as {string} and Password as {string}")
    public void user_enters_username_as_and_password_as(String email, String password) {
        lp.setUsername(email);
        lp.setPassword(password);
    }

    @Then("User clicks on Submit button")
    public void user_clicks_on_submit_button() throws InterruptedException {
        lp.clickSubmit();
        Thread.sleep(2000);

    }

    @Then("User clicks the Player icon")
    public void user_clicks_the_player_icon() throws InterruptedException {
        lp.clickPlayer();
        Thread.sleep(2000);

        if(driver.getPageSource().contains("ggr")) {
            System.out.println("Player Login Verified");
        }else{
            System.out.println("Player Verification FAILED");
        }

    }

    @Then("User clicks the Logout button")
    public void user_clicks_the_logout_button() throws InterruptedException {
        lp.clickLogout();
        Thread.sleep(2000);

    }

    @And("Close browser")
    public void close_browser() {
        driver.quit();


    }



}
