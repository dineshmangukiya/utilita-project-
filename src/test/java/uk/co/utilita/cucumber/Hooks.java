package uk.co.utilita.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.co.utilita.basepage.BasePage;
import uk.co.utilita.browserselector.BrowserSelector;
import uk.co.utilita.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    /**
     * Object creation for browser selector class
     */
    BrowserSelector browserSelector = new BrowserSelector();
    /**
     * Object creation for load property class
     */
    LoadProperty loadProperty = new LoadProperty();

    /**
     * Initialize global variable
     */
    String browser = loadProperty.getProperty("browser");
    String baseUrl = loadProperty.getProperty("baseUrl");

    @Before
    /**
     * Below method open browser and maximize browser and wait method to wait on each element when execution start
     */

    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @After
    /**
     * Below quit method to close all browser after executions
     */

    public void tearDown() {
        driver.quit();
    }
}
