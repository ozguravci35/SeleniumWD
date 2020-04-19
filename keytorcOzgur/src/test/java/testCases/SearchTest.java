package testCases;

import listener.Listener;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Listeners;
import testCaseFunction.EnterTestFunction;
import testCaseFunction.SearchFunction;
import utils.BaseTest;

import java.util.concurrent.TimeUnit;

@Listeners({Listener.class})
public class SearchTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver", "/Users/Özgür/IdeaProjects/keytorcOzgur/driver/chromedriver.exe");
        driver = new ChromeDriver(capabilities);
        driver.manage().window().maximize();
        ;
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void searchTest() {
        SearchFunction arama = new SearchFunction(driver);
        arama.searchTest();


    }
}
