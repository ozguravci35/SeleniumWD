package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class EnterTestFunction extends BasePage{

    public EnterTestFunction(WebDriver driver){
        super(driver);
    }

    public  void searchTest(){
        element(By.className("btnSignIn")).click();
    }

}
