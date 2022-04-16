package MyStepsDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinbetSteps {

    WebDriver driver;


    @Given("Launch Chrome browser")
    public void launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver=new ChromeDriver();
    }

    @When("Open WINBET BG homepage")
    public void open_winbet_bg_homepage() {

        driver.get("https://wb-user:1qwinbet@winbet-int.egt-digital.com/sports");
        driver.manage().window().setSize(new Dimension(1920, 1080));


    }

    @Then("Verify the logo is present on the page")
    public void verify_the_logo_is_present_on_the_page() {

        boolean status = driver.findElement(By.id("app-logo-navbar")).isDisplayed();
        Assert.assertEquals(true,status);

    }

    @And("Close the browser")
    public void close_the_browser() {
        driver.quit();

    }

}

