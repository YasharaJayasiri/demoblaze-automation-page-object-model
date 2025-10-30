package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_LoginPage {
    //Identify web elements
    By Username=By.xpath("//*[@id=\"loginusername\"]");
    By Password=By.xpath("//*[@id=\"loginpassword\"]");
    By loginButton=By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    By dashboardLoginButton=By.xpath("//*[@id=\"login2\"]");

    //define the web driver
    WebDriver PageClassWebDriver;

    public POM_LoginPage(WebDriver TestClassParameterDriver)
    {
        this.PageClassWebDriver=TestClassParameterDriver;

    }
    //Initialize methods

    public void clickLoginButton()
    {
        PageClassWebDriver.findElement(dashboardLoginButton).click();
    }

    public void passingValuesToUserNamePassword(String TxtUserName, String TxtPassword)
    {
        PageClassWebDriver.findElement(Username).sendKeys(TxtUserName);
        PageClassWebDriver.findElement(Password).sendKeys(TxtPassword);
    }

    public void clickOkLoginButton()
    {
        PageClassWebDriver.findElement(loginButton).click();
    }


}
