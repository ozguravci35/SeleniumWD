package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class SearchFunction extends BasePage {

    public SearchFunction(WebDriver driver) {
        super(driver);
    }

    public  void searchTest(){

        element(By.xpath(".//*[@id='contentListing']/div/div/div[2]/div[4]/a[2]")).click();//3.ürüne tıklar
        element(By.xpath(".//*[@id='p-417970871']/div/a")).click();
    }


}
