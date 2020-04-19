package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class SigninFunction extends BasePage {


    public SigninFunction(WebDriver driver) {
        super(driver);
    }

    private By eMail= By.id("email");
    private By password= By.id("password");
    private By submit=By.id("loginButton");
    private By input=By.id("searchData");
    private By button=By.className("searchBtn");


    public  void  signinForm(){
        sendKeys(eMail,"test@msn.com");
        sendKeys(password,"test");
        element(submit).click();
        element(input).sendKeys("samsung");
        element(button).click();


    }
}
