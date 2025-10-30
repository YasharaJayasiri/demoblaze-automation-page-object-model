package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class POM_CheckoutPage {
    //Identify web elements
    By HomeButton=By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");
    By SamsungPhoneButton=By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By AddToCartButton=By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    By CartButton=By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a");
    By PlaceOrderButton=By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    By categoryText=By.xpath("//*[@id=\"page-wrapper\"]/div/div[1]/h2");

    //define the web driver
    WebDriver PageClassWebDriver;
    String expectedTitle="Products";

    public POM_CheckoutPage(WebDriver TestClassParameterDriver)
    {
        this.PageClassWebDriver=TestClassParameterDriver;

    }

    public void clickHomeButton()
    {
        PageClassWebDriver.findElement(HomeButton).click();
    }
    public void clickSamsungPhoneButton()
    {
        PageClassWebDriver.findElement(SamsungPhoneButton).click();
    }
    public void clickAddToCartButton()
    {
        PageClassWebDriver.findElement(AddToCartButton).click();
    }
    public void clickCartButton()
    {
        try {
            Thread.sleep(2000);
            PageClassWebDriver.switchTo().alert().accept(); // Accept alert FIRST
        } catch (Exception e) {
            System.out.println("No alert appeared.");
        }

        PageClassWebDriver.findElement(CartButton).click();
    }

    public boolean verifyTitle() {
        String actualTitle = PageClassWebDriver.findElement(categoryText).getText();
        Assert.assertEquals(actualTitle, "Products", "Category Title Mismatch!");
        return true;
    }
    public void PlaceOrderButton()
    {
        PageClassWebDriver.findElement(PlaceOrderButton).click();
    }


}
