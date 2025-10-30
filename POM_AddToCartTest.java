package TestClass;

import PageClass.POM_AddToCartPage;
import PageClass.POM_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM_AddToCartTest {
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
    public void AddToCartPageCheck() throws InterruptedException {
        //Constructor method from page class
        POM_AddToCartPage AddToCart = new POM_AddToCartPage(TestClassChromeDriver);
        AddToCart.clickHomeButton();
        Thread.sleep(2000); // WAIT FOR SIGNUP POPUP TO OPEN

        AddToCart.clickSamsungButton();
        Thread.sleep(2000);

        AddToCart.verifyProductTitle();
        System.out.println("✅ title verified.");

        AddToCart.clickAddToCartButton();
        Thread.sleep(2000);

    }
    @AfterTest()
    public void AfterTestMethod () throws InterruptedException {
        Thread.sleep(5000);
        TestClassChromeDriver.quit();


    }

}
