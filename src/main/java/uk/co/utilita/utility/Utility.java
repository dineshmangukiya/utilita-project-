package uk.co.utilita.utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import uk.co.utilita.basepage.BasePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;



public class Utility extends BasePage {

    public JavascriptExecutor js;

    public void windowScroll() {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)");

    }

    /**
     * This method will click on element
     */
    public void clickOnElement(WebElement element) {
        element.click();
    }

    /**
     * This method will return text from element
     */

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /**
     * This method will send text to element
     */

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }

    /**
     * This method will used to hover mouse on element
     */
    public void mouseHoverToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement((element)).perform();
    }

    public void selectByValueFromDropDownMenu(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public void waitOnTheElement(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    /**
     * This method is verify elements is displayed on page
     *
     * @param element
     * @param text
     * @return
     */
    public boolean verifyThatTextIsDisplayed(WebElement element, String text) {
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }

    }


    public void priceRangeSlider(WebElement element) {

        WebElement mainSlider = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/ul[1]/div[1]/div[1]/a[1]"));

        int width = mainSlider.getSize().width;
        int priceTwenty = width + 45;


        WebElement slider = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/ul[1]/div[1]/div[1]/a[2]"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(slider);
        actions.dragAndDropBy(mainSlider, priceTwenty, 0).perform();
    }

    /**
     * This method will generate random data
     *
     * @param length
     * @return
     */

    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    /**
     * This method select by visible text from drop down
     *
     * @param element
     * @param str
     */
    public void selectByVisibleTextFromDropDownMenu(WebElement element, String str) {
        Select select = new Select(element);
        select.selectByVisibleText(str);
    }

    /**
     * This method will take screen shot
     */
    public void takeScreenShot() {
        String filePath = System.getProperty("user.dir") + "/src/main/java/com/automationpractice/screenshot/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr1, new File(filePath + getRandomString(10) + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

