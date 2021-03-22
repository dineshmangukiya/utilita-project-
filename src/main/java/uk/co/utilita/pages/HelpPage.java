package uk.co.utilita.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.utilita.utility.Utility;

public class HelpPage extends Utility {
    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(HelpPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */
    @FindBy(xpath = "//body/div[2]/div[1]/ul[1]/div[1]/div[1]/li[4]")
    WebElement _helpBtn;

    @FindBy(xpath = "//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    WebElement _allowAll;

    public void clickOnHelpButton() {
        clickOnElement(_allowAll);
        Reporter.addStepLog("Clicking on help Button" + _helpBtn.toString());
        clickOnElement(_helpBtn);
        log.info("Clicking on help Button" + _helpBtn.toString());
    }
}

