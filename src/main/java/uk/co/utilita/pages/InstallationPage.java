package uk.co.utilita.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.utilita.utility.Utility;

public class InstallationPage extends Utility {

    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(InstallationPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */
    @FindBy(xpath = "//body/section[1]/div[1]/div[1]/div[1]/div[1]/ul[3]/li[1]/a[1]")
    WebElement _installationBtn;

    @FindBy(xpath = "//h1[contains(text(),'Installing your Smart Meter')]")
    WebElement _getInstallationMessage;

    public void clickOnInstallationBtn() {
        Reporter.addStepLog("Clicking on installation Button" + _installationBtn.toString());
        clickOnElement(_installationBtn);
        log.info("Clicking on installation Button" + _installationBtn.toString());
    }

    public String getInstallationText(){
        Reporter.addStepLog("Getting Installation smart meter text" + _getInstallationMessage.toString());
        log.info("Getting Installation smart meter text" + _getInstallationMessage.toString());
        return getTextFromElement(_getInstallationMessage);
    }
}
