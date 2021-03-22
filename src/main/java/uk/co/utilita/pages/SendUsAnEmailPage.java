package uk.co.utilita.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.utilita.utility.Utility;

public class SendUsAnEmailPage extends Utility {

    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(SendUsAnEmailPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */
    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]")
    WebElement _sendUsAnEmailBtn;

    public void clickOnSendUsAnEmailButton() {
        Reporter.addStepLog("Clicking on send us an email Button" + _sendUsAnEmailBtn.toString());
        clickOnElement(_sendUsAnEmailBtn);
        log.info("Clicking on Send us an email Button" + _sendUsAnEmailBtn.toString());
    }
}
