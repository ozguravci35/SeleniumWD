package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){

        this.driver=driver;
        wait = new WebDriverWait(driver, 20);
    }

    public WebElement element(By Locator){

        return  driver.findElement(Locator);
    }

    public  void sendKeys(By Locator,String value){
        element(Locator).sendKeys(value);
    }
}
