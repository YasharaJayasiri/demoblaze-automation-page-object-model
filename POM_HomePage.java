package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class POM_HomePage {
    //Identify web elements
    By Home=By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");
    By Phones=By.xpath("//a[text()='Phones']");
    By categoryText=By.id("cat");

    //define the web driver
    WebDriver PageClassWebDriver;
    String expectedTitle="CATEGORIES";

    public POM_HomePage(WebDriver TestClassParameterDriver)
    {
        this.PageClassWebDriver=TestClassParameterDriver;

    }
    //Initialize methods

    public void clickHomeButton()
    {
        PageClassWebDriver.findElement(Home).click();
    }

    public boolean verifyPageTitle() {
        String actualTitle = PageClassWebDriver.findElement(categoryText).getText();
        Assert.assertEquals(actualTitle, "CATEGORIES", "Category Title Mismatch!");
        return true;
    }
    public void clickPhonesButton()
    {
        PageClassWebDriver.findElement(Phones).click();
    }





}
