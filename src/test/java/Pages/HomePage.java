package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement elementsButton;
    WebElement formsButton;
    WebElement alertsFrameAndWindowButton;
    WebElement widgetsButton;
    WebElement interactionButton;
    WebElement bookStoreApplicationButton;
    List <WebElement> lista;

    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getLista() {

        return driver.findElements(By.xpath("//div[@class='card-body']//h5"));
    }

    public WebElement getElementsButton() {

        WebElement element = null;
        for (int i = 0; i < getLista().size(); i++) {
            if (getLista().get(i).getText().equals("Elements")) {
                element = getLista().get(i);
                break;

            }}
        return element;
    }


    public void clickOnElements() {
        getElementsButton().click();
    }

}



   /* public WebElement getElementsButton() {
        return driver.findElement(By.linkText("Elements"));
    }

    public WebElement getFormsButton() {
        return driver.findElement(By.linkText("Forms"));
    }

    public WebElement getAlertsFrameAndWindowButton() {
        return driver.findElement(By.linkText("Alerts, Frame & Windows"));
    }

    public WebElement getWidgetsButton() {
        return driver.findElement(By.linkText("Widgets"));
    }

    public WebElement getInteractionButton() {
        return driver.findElement(By.linkText("Interactions"));
    }

    public WebElement getBookStoreApplicationButton() {
        return driver.findElement(By.linkText("Book Store Application"));
    }

    //============================================

    public void ClickOnElementsButton () {
        getElementsButton().click();
    }
    public void ClickOnFormsButton () {
        getFormsButton().click();
    }
    public void ClickOnAlertsFrameAndWindowButton () {
        getAlertsFrameAndWindowButton().click();
    }
    public void ClickOnWidgetsButton () {
        getWidgetsButton().click();
    }
    public void ClickOnInteractionButton () {
        getInteractionButton().click();
    }
    public void ClickOnBookStoreApplicationButton () {
        getBookStoreApplicationButton().click();
    }
}*/



