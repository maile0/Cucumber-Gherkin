package pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver ldriver;
    public LoginPage(WebDriver rdriver) {

        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    // Elements below by selector

    @FindBy (css = ".mnav__login-btn")
    @CacheLookup
    WebElement bntLogin;

    @FindBy (name = "username")
    @CacheLookup
    WebElement btnUsername;

    @FindBy (name = "password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy (css = ".btn-action")
    @CacheLookup
    WebElement bntSubmit;

    @FindBy (css = ".nav-user__btn:nth-child(1) > .icon")
    @CacheLookup
    WebElement btnPlayer;

    @FindBy (css = ".grid-cols-span-3")
    @CacheLookup
    WebElement btnLogout;



    // Action Meters for each Element

    public void clickLoginButton() {
        bntLogin.click();

    }

    public void setUsername(String uname) {
        btnUsername.clear();
        btnUsername.sendKeys(uname);

    }

    public void setPassword(String pwd) {
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }

    public void clickSubmit() {
        bntSubmit.click();
    }

    public void clickPlayer() {
        btnPlayer.click();

    }

    public void clickLogout() {
        btnLogout.click();

    }

}
