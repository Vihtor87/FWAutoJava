package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = "//*[@id='user_email']")
    private WebElement login;
    @FindBy(xpath = "//*[@id='user_password']")
    private WebElement password;
    @FindBy(xpath = "//*[@value='Войти']")
    private WebElement buttonEnter;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void loginUserPage(String loginUserAccount){
        login.sendKeys(loginUserAccount);
    }
    public void passwordUserPage(String passwordUserAccount){
        password.sendKeys(passwordUserAccount);
    }
    public  void  buttonEnterPage(){
        buttonEnter.click();
    }
}
