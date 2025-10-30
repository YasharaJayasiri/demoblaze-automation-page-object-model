package TestClass;

import PageClass.POM_HomePage;
import PageClass.POM_LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM_HomeTest {
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
    public void HomePageElementsCheck() throws InterruptedException {
        //Constructor method from page class
        POM_HomePage CheckUp = new POM_HomePage(TestClassChromeDriver);
        CheckUp.clickHomeButton();
        Thread.sleep(2000); // WAIT FOR SIGNUP POPUP TO OPEN

        CheckUp.clickPhonesButton();
        Thread.sleep(2000);

        CheckUp.verifyPageTitle();
        System.out.println("✅ Category title verified.");

    }

    @AfterTest()
    public void AfterTestMethod () throws InterruptedException {
        Thread.sleep(5000);
        TestClassChromeDriver.quit();


    }

}
