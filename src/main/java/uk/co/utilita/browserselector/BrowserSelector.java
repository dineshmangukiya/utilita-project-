package uk.co.utilita.browserselector;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import uk.co.utilita.basepage.BasePage;

public class BrowserSelector extends BasePage {

    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());

    /**
     * Project path to get property of user directory
     */
    String projectPath = System.getProperty("user.dir");

    /**
     * Below codes to run programme in any browser
     *
     * @param browser
     */

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/driver/chromedriver.exe");
            log.info("Launching Chrome Browser");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "/driver/geckodriver.exe");
            log.info("Launching FireFox Browser");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", projectPath + "/driver/IEDriverServer.exe");
            log.info("Launching IE Browser");
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Browser is not available");
            log.info("Browser is not available");
        }


    }

}
