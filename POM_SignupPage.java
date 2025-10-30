package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_SignupPage {
    //Identify web elements
    By username=By.xpath("//*[@id=\"sign-username\"]");
    By password=By.xpath("//*[@id=\"sign-password\"]");
    By signupButton=By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By dashboardSignupButton=By.xpath("//*[@id=\"signin2\"]");


    //define the web driver
    WebDriver PageClassWebDriver;

    public POM_SignupPage(WebDriver TestClassParameterDriver)
    {
        this.PageClassWebDriver=TestClassParameterDriver;

    }
    //  Initialize methods

    public void clickSignupButton()
    {
        PageClassWebDriver.findElement(dashboardSignupButton).click();
    }

    public void passingValuesToUserNamePassword(String TxtuserName, String Txtpassword)
    {
        PageClassWebDriver.findElement(username).sendKeys(TxtuserName);
        PageClassWebDriver.findElement(password).sendKeys(Txtpassword);
    }

    public void clickOkSignupButton()
    {
        PageClassWebDriver.findElement(signupButton).click();
    }








}
