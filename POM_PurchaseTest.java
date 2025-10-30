package TestClass;

import PageClass.POM_CheckoutPage;
import PageClass.POM_PurchasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM_PurchaseTest {
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
        POM_PurchasePage PurchaseCheck = new POM_PurchasePage(TestClassChromeDriver);
        PurchaseCheck.clickHomeButton();
        Thread.sleep(2000); // WAIT FOR SIGNUP POPUP TO OPEN

        PurchaseCheck.clickSamsungPhoneButton();
        Thread.sleep(2000);

        PurchaseCheck.clickAddToCartButton();
        Thread.sleep(2000);

        PurchaseCheck.clickCartButton();
        Thread.sleep(2000);

        PurchaseCheck.verifyTitle();
        System.out.println("✅ title verified.");

        PurchaseCheck.PlaceOrderButton();
        Thread.sleep(2000);

        // starting from the form
        PurchaseCheck.passingValueToNameAndCountry("Chandana", "600800400");
        Thread.sleep(2000);

        PurchaseCheck.passingValueToCityAndCreditCard("Chandana", "600800400");
        Thread.sleep(2000);

        PurchaseCheck.passingValueToMonthAndYear("Chandana", "600800400");
        Thread.sleep(2000);

        PurchaseCheck.clickPurchaseButton();
        Thread.sleep(2000);
        PurchaseCheck.clickOkayButton();
        Thread.sleep(2000);





    }
    @AfterTest()
    public void AfterTestMethod () throws InterruptedException {
        Thread.sleep(5000);
        TestClassChromeDriver.quit();


    }

}
