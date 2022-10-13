package Test;

import Base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTest extends BaseTest {


    //string for happy flow
    String validFullName = "SaraCiric";
    String validEmail = "saraciric1994@gmail.com";
    String validCurrentAddress = "Cara Lazara 121a";
    String validPermanentAddress = "Janosikova 74";





    @BeforeMethod
    public void pageSetUp (){
        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();

    }
    @Test
    public void textBoxHappyFlow() throws InterruptedException {
       scrollIntoView(homePage.getElementsButton());
       homePage.clickOnElements();
       sidebarPage.clickOnTextBoxButton();
       //Thread.sleep (10000);
      visabilityWait(textBoxPage.getFullNameTextBox());
      scrollIntoView(textBoxPage.getFullNameTextBox());
      textBoxPage.fullNameTextBoxSendKeys(validFullName);
      textBoxPage.emailTextBoxSendKeys(validEmail);
      textBoxPage.currentAddressTextBoxSendKeys(validCurrentAddress);
      textBoxPage.permanentAddressTextBoxSendKeys(validPermanentAddress);
      textBoxPage.clickOnSubmitButton();

    }


    @Test
    public void checkBoxHappyFlow () throws InterruptedException {
        scrollIntoView(homePage.getElementsButton());
        homePage.clickOnElements();
        sidebarPage.ClickOnCheckBoxButton();
        checkBoxPage.ClickOnExpandMenuButton();
        Thread.sleep(3000);
        checkBoxPage.ClickOnExpandDesktopButton();
        checkBoxPage.ClickOnExpandedDocumentsButton();
        checkBoxPage.ClickOnExpandedDownloadsButton();
        Thread.sleep(2000);

        checkBoxPage.clickOnHomeCheckBox();
        checkBoxPage.clickOnHomeCheckBox();
        checkBoxPage.clickOnDesktopCheckBox();
    }
}
