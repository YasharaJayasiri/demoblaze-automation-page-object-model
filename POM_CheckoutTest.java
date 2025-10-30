package TestClass;

import PageClass.POM_AddToCartPage;
import PageClass.POM_CheckoutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM_CheckoutTest {
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
    public void CheckoutPageCheck() throws InterruptedException {
        //Constructor method from page class
        POM_CheckoutPage CheckoutCheck = new POM_CheckoutPage(TestClassChromeDriver);
        CheckoutCheck.clickHomeButton();
        Thread.sleep(2000); // WAIT FOR SIGNUP POPUP TO OPEN

        CheckoutCheck.clickSamsungPhoneButton();
        Thread.sleep(2000);

        CheckoutCheck.clickAddToCartButton();
        Thread.sleep(2000);

        CheckoutCheck.clickCartButton();
        Thread.sleep(2000);

        CheckoutCheck.verifyTitle();
        System.out.println("✅ title verified.");

        CheckoutCheck.PlaceOrderButton();
        Thread.sleep(2000);

    }
    @AfterTest()
    public void AfterTestMethod () throws InterruptedException {
        Thread.sleep(5000);
        TestClassChromeDriver.quit();


    }
}
