package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SidebarPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement textBoxButton;
    WebElement checkBoxButton;

//================================================
    public SidebarPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }


    //====================================
    public WebElement getTextBoxButton() {
        return driver.findElement(By.className("text"));
    }

    public WebElement getCheckBoxButton() {
        return driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
    }

    //========================================
    public void clickOnTextBoxButton() {
        getTextBoxButton().click();
    }
    public void ClickOnCheckBoxButton (){
        getCheckBoxButton().click();
    }
}
