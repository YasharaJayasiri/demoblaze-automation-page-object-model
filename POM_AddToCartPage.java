package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class POM_AddToCartPage {
    //Identify web elements
    By HomeButton=By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");
    By SamsungPhoneButton=By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By AddToCartButton=By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    By categoryText=By.xpath("//*[@id=\"more-information\"]/strong");

    //define the web driver
    WebDriver PageClassWebDriver;
    String expectedTitle="Product description";

    public POM_AddToCartPage(WebDriver TestClassParameterDriver)
    {
        this.PageClassWebDriver=TestClassParameterDriver;

    }

    //Initialize methods

    public void clickHomeButton()
    {
        PageClassWebDriver.findElement(HomeButton).click();
    }
    public void clickSamsungButton()
    {
        PageClassWebDriver.findElement(SamsungPhoneButton).click();
    }

    public boolean verifyProductTitle() {
        String actualTitle = PageClassWebDriver.findElement(categoryText).getText();
        Assert.assertEquals(actualTitle, "Product description", "Category Title Mismatch!");
        return true;
    }
    public void clickAddToCartButton()
    {
        PageClassWebDriver.findElement(AddToCartButton).click();
    }



}
