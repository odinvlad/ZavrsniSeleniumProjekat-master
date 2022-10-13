package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement fullNameTextBox;
    WebElement emailTextBox;
    WebElement currentAddressTextBox;
    WebElement permanentAddressTextBox;
    WebElement submitButton;

    public TextBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullNameTextBox() {
        return driver.findElement(By.id("userName"));
    }

   public WebElement getEmailTextBox() {
        return driver.findElement(By.id("userEmail"));
    }

     public WebElement getCurrentAddressTextBox() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddressTextBox() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public void fullNameTextBoxSendKeys (String fullName){
        getFullNameTextBox().sendKeys(fullName);
    }
    public void emailTextBoxSendKeys(String email){
        getEmailTextBox().sendKeys(email);
    }
    public void currentAddressTextBoxSendKeys (String currentAddress) {
        getCurrentAddressTextBox().sendKeys(currentAddress);
    }
    public void permanentAddressTextBoxSendKeys (String permanentAddress) {
        getPermanentAddressTextBox().sendKeys(permanentAddress);
    }
    public void clickOnSubmitButton () {
        getSubmitButton().click();
    }
}
