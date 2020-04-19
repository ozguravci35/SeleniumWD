package testCases;

import listener.Listener;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.SigninFunction;
import utils.BaseTest;

import java.util.concurrent.TimeUnit;

@Listeners({Listener.class})
public class SigninTest extends BaseTest {

    @Before
    public  void  setUp() throws  Exception{
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver","/Users/Özgür/IdeaProjects/keytorcOzgur/driver/chromedriver.exe");
        driver=new ChromeDriver(capabilities);
        driver.manage().window().maximize();;
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }
    @After
    public void  tearDown() throws  Exception{
        driver.quit();
    }

    @Test
    public void  signinTestCase(){
        SigninFunction sign=new SigninFunction(driver);
        sign.signinForm();
    }
}
