package TestClass;

import PageClass.POM_LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM_LoginTest {
    //Global Variable Section
    String BaseURL = "https://www.demoblaze.com/";
    WebDriver TestClassChromeDriver;

    @BeforeTest
    public void BeforeTestMethod() {
        //WebDriverManager.chromedriver().setup();
        TestClassChromeDriver = new ChromeDriver();
        TestClassChromeDriver.manage().window().maximize();
        TestClassChromeDriver.get(BaseURL);
    }

    @Test(priority = 1)
    public void DashboardLoginButtonClick() throws InterruptedException {
        //Constructor method from page class
        POM_LoginPage Login = new POM_LoginPage(TestClassChromeDriver);
        Login.clickLoginButton();
        Thread.sleep(2000); // WAIT FOR SIGNUP POPUP TO OPEN

        Login.passingValuesToUserNamePassword("Chandana", "600800400");
        Thread.sleep(2000);

        Login.clickOkLoginButton();
    }

    @AfterTest()
    public void AfterTestMethod () throws InterruptedException {
        Thread.sleep(5000);
        TestClassChromeDriver.quit();


    }

}
