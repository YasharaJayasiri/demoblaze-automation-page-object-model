package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class POM_PurchasePage {
    //Identify web elements
    By HomeButton=By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");
    By SamsungPhoneButton=By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By AddToCartButton=By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    By CartButton=By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a");
    By PlaceOrderButton=By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    By categoryText=By.xpath("//*[@id=\"page-wrapper\"]/div/div[1]/h2");

    By Name=By.xpath("//*[@id=\"name\"]");
    By Country=By.xpath("//*[@id=\"country\"]");
    By City=By.xpath("//*[@id=\"city\"]");
    By CreditCard=By.xpath("//*[@id=\"card\"]");
    By Month=By.xpath("//*[@id=\"month\"]");
    By Year=By.xpath("//*[@id=\"year\"]");
    By PurchaseButton=By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By OkayButton=By.xpath("/html/body/div[10]/div[7]/div/button");

    //define the web driver
    WebDriver PageClassWebDriver;
    String expectedTitle="Products";

    public POM_PurchasePage(WebDriver TestClassParameterDriver)
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



    //From the form onwards
    public void passingValueToNameAndCountry(String TxtName, String TxtCountry) {
        PageClassWebDriver.findElement(Name).sendKeys(TxtName);
        PageClassWebDriver.findElement(Country).sendKeys(TxtCountry);

    }
    public void passingValueToCityAndCreditCard(String TxtCity, String TxtCreditCard) {
        PageClassWebDriver.findElement(City).sendKeys(TxtCity);
        PageClassWebDriver.findElement(CreditCard).sendKeys(TxtCreditCard);

    }
    public void passingValueToMonthAndYear(String TxtMonth, String TxtYear) {
        PageClassWebDriver.findElement(Month).sendKeys(TxtMonth);
        PageClassWebDriver.findElement(Year).sendKeys(TxtYear);

    }
    public void clickPurchaseButton()
    {
        PageClassWebDriver.findElement(PurchaseButton).click();
    }
    public void clickOkayButton()
    {
        PageClassWebDriver.findElement(OkayButton).click();
    }





}
