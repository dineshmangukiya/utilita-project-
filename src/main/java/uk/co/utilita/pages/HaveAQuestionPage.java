package uk.co.utilita.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.utilita.utility.Utility;

import javax.rmi.CORBA.Util;

public class HaveAQuestionPage extends Utility {

    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(HaveAQuestionPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */
    @FindBy(xpath = "//h3[contains(text(),'Have a question about your install?')]")
    WebElement _haveAQuestionBtn;

    @FindBy(xpath = "//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/select[1]")
    WebElement _queAbtMyInstall;

    @FindBy(xpath = "//body/section[1]/div[1]/div[1]/div[2]/form[1]/div[20]/div[2]/input[1]")
    WebElement _submitBtn;

    @FindBy(xpath ="//h1[contains(text(),'Have a question about your install?')]" )
    WebElement _contactFormMessage;

    @FindBy(xpath = "//body/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/label[1]")
    WebElement _getTitleErrorMsg;

    @FindBy(xpath = "//body/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/label[1]")
    WebElement _getFirstNameErrorMsg;

    @FindBy(xpath = "//body/section[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[2]/label[1]")
    WebElement _getLastNameErrorMsg;

    @FindBy(xpath = "//body/section[1]/div[1]/div[1]/div[2]/form[1]/div[12]/div[3]/div[2]/label[1]")
    WebElement _getAddressOneErrorMsg;

    @FindBy(xpath = "//body/section[1]/div[1]/div[1]/div[2]/form[1]/div[17]/fieldset[1]/label[1]")
    WebElement _getPreferredContactMethodErrorMsg;

    @FindBy(xpath = "//body/section[1]/div[1]/div[1]/div[2]/form[1]/div[16]/div[2]/label[1]")
    WebElement _getYourQuestionErrorMsg;


    public void clickOnHaveAQuestionButton() {
        Reporter.addStepLog("Clicking on Have a question Button" + _haveAQuestionBtn.toString());
        clickOnElement(_haveAQuestionBtn);
        log.info("Clicking on Have a question Button" + _haveAQuestionBtn.toString());
    }
    public String getContactFormMessage(){
        Reporter.addStepLog("Getting manage your install message" + _contactFormMessage.toString());
        log.info("Getting manage your install message" + _contactFormMessage.toString());
        return getTextFromElement(_contactFormMessage);
    }

    public void selectQueAbtMyInstall(){
        Reporter.addStepLog("selecting question about my install option" + _queAbtMyInstall.toString());
        clickOnElement(_queAbtMyInstall);
        log.info("selecting question about my install option" + _queAbtMyInstall.toString());

    }
    public void clickOnSubmitButton() {
        Reporter.addStepLog("Clicking on Submit Button" + _submitBtn.toString());
        clickOnElement(_submitBtn);
        log.info("Clicking on Submit Button" + _submitBtn.toString());
    }


    public String getTitleMessage(){
        Reporter.addStepLog("Getting title error message" + _getTitleErrorMsg.toString());
        log.info("Getting title error message" +  _getTitleErrorMsg.toString());
        return getTextFromElement( _getTitleErrorMsg);
    }
    public String getFNameErrorMessage(){
        Reporter.addStepLog("Getting First name error message" + _getFirstNameErrorMsg.toString());
        log.info("Getting First name error message" +  _getFirstNameErrorMsg.toString());
        return getTextFromElement(_getFirstNameErrorMsg);
    }
    public String getLNameErrorMessage(){
        Reporter.addStepLog("Getting Last name error message" + _getLastNameErrorMsg.toString());
        log.info("Getting Last name error message" +  _getLastNameErrorMsg.toString());
        return getTextFromElement(_getLastNameErrorMsg);
    }

    public String getAddressOneErrorMessage(){
        Reporter.addStepLog("Getting Address one error message" + _getAddressOneErrorMsg.toString());
        log.info("Getting Address one error message" +  _getAddressOneErrorMsg.toString());
        return getTextFromElement(_getAddressOneErrorMsg);
    }

    public String getPreferredContactMethodErrorMessage(){
        Reporter.addStepLog("Getting Preferred Contact Method error message" + _getPreferredContactMethodErrorMsg.toString());
        log.info("Getting Preferred Contact Method error message" +  _getPreferredContactMethodErrorMsg.toString());
        return getTextFromElement(_getPreferredContactMethodErrorMsg);
    }

    public String getYourQuestionErrorMessage(){
        Reporter.addStepLog("Getting Your Question error message" + _getYourQuestionErrorMsg.toString());
        log.info("Getting Your Question error message" +  _getYourQuestionErrorMsg.toString());
        return getTextFromElement(_getYourQuestionErrorMsg);
    }

}
