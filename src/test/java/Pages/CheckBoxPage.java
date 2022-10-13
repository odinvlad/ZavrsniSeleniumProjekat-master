package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CheckBoxPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement expandMenuButton;
    WebElement expandDesktopButton;
    WebElement expandDocumentsButton;
    WebElement expandDownloadsButton;

    WebElement homeCheckBox;
    WebElement desktopCheckBox;
    WebElement documentsCheckBox;
    WebElement downloadsCheckBox;

    WebElement notesCheckBox;
    WebElement commandsCheckBox;

    WebElement workSpaceCheckBox;
    WebElement officeCheckBox;

    WebElement wordFileDocCheckBox;
    WebElement excelFileDocCheckBox;
    List<WebElement> list1;



//========================================================
    public CheckBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }




//===============================================================
   public WebElement getExpandMenuButton() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close"));
    }
    //*************************************************************
   /* public List<WebElement> getList1() {
        return driver.findElements(By.cssSelector(".rct-node.rct-node-parent.rct-node-expanded"));
    }

    public WebElement getExpandMenuButton() {
        WebElement DesktopExpandButton = null;
        for (int i = 0; i< getList1().size(); i++){
            if (getList1().get(i).getText().equals("Home")){
                DesktopExpandButton = getList1().get(i);
                break;
            }

        }
        return DesktopExpandButton;

    }

    public WebElement getExpandDesktopButton() {
        WebElement DesktopExpandButton = null;
        for (int i = 0; i< getList1().size(); i++){
            if (getList1().get(i).getText().equals("Desktop")){
                DesktopExpandButton = getList1().get(i);
                break;
            }

        }
        return DesktopExpandButton;*/
    //******************************************OVO MI NIJE RADILO**********************************

    public WebElement getExpandDesktopButton(){
        return driver.findElement(By.xpath("(//span [contains(text(),'Desktop')]/../preceding-sibling::button)"));
    }

    public WebElement getExpandDocumentsButton() {
        return driver.findElement(By.xpath("(//span[contains(text(),'Documents')]/../preceding-sibling::button)"));
    }

    public WebElement getExpandDownloadsButton() {
        return driver.findElement(By.xpath("(//span[contains(text(),'Downloads')]/../preceding-sibling::button)"));
    }

    public WebElement getHomeCheckBox() {
        return driver.findElement(By.className("rct-title"));
    }

    public WebElement getDesktopCheckBox() {
        return driver.findElement(By.xpath("(//input [@id= 'tree-node-desktop']/../span [@class='rct-checkbox'])"));
    }

    public WebElement getDocumentsCheckBox() {
        return documentsCheckBox;
    }

    public WebElement getDownloadsCheckBox() {
        return downloadsCheckBox;
    }

    public WebElement getNotesCheckBox() {
        return notesCheckBox;
    }

    public WebElement getCommandsCheckBox() {
        return commandsCheckBox;
    }

    public WebElement getWorkSpaceCheckBox() {
        return workSpaceCheckBox;
    }

    public WebElement getOfficeCheckBox() {
        return officeCheckBox;
    }

    public WebElement getWordFileDocCheckBox() {
        return wordFileDocCheckBox;
    }

    public WebElement getExcelFileDocCheckBox() {
        return excelFileDocCheckBox;
    }




    //=========================================================
    public void ClickOnExpandMenuButton(){
        getExpandMenuButton().click();
    }
    public void ClickOnExpandDesktopButton (){
        getExpandDesktopButton().click();
    }
    public void ClickOnExpandedDocumentsButton (){
        getExpandDocumentsButton().click();
    }
    public void ClickOnExpandedDownloadsButton (){
        getExpandDownloadsButton().click();
    }

    public void clickOnHomeCheckBox (){
        getHomeCheckBox().click();
    }
    public void clickOnDesktopCheckBox (){
        getDesktopCheckBox().click();
    }





}
