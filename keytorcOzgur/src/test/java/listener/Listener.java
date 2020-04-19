package listener;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;

public class Listener extends BaseTest implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        driver.get(baseUrl);

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Başarılı");

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Başarısız");

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("skip");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        driver=new ChromeDriver();

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        driver.quit();

    }
}
