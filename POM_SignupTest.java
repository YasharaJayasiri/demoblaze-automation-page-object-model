package TestClass;

import PageClass.POM_SignupPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM_SignupTest {

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
    public void DashboardSignupButtonClick() throws InterruptedException {
        //Constructor method from page class
        POM_SignupPage Signup = new POM_SignupPage(TestClassChromeDriver);
        Signup.clickSignupButton();
        Thread.sleep(2000); // WAIT FOR SIGNUP POPUP TO OPEN

        Signup.passingValuesToUserNamePassword("Chandana", "600800400");
        Thread.sleep(2000);

        Signup.clickOkSignupButton();
    }
    @AfterTest()
    public void AfterTestMethod () throws InterruptedException {
        Thread.sleep(5000);
        TestClassChromeDriver.quit();


    }




    }

