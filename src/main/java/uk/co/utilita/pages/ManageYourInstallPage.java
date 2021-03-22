package uk.co.utilita.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.utilita.utility.Utility;

public class ManageYourInstallPage extends Utility {

    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(ManageYourInstallPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */
    @FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")
    WebElement _manageYourInstallBtn;

    @FindBy(xpath = "//h1[contains(text(),'Manage your Install')]")
    WebElement _getManageYourInstallMessage;

    public void clickOnManageYourInstallBtn() {
        Reporter.addStepLog("Clicking on manage your install" + _manageYourInstallBtn.toString());
        clickOnElement(_manageYourInstallBtn);
        log.info("Clicking on manage your install" + _manageYourInstallBtn.toString());
    }

    public String getManageYourInstallMessage(){
        Reporter.addStepLog("Getting manage your install message" + _getManageYourInstallMessage.toString());
        log.info("Getting manage your install message" + _getManageYourInstallMessage.toString());
        return getTextFromElement(_getManageYourInstallMessage);
    }
}
