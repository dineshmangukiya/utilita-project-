package uk.co.utilita.cucumber.stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.utilita.pages.*;

public class MyStepdefs {
        @Given("^I am on the utilita website$")
        public void iAmOnTheUtilitaWebsite(){
            }

    @When("^user clicks on Help Then Help screen \\(https://utilita\\.co\\.uk/help\\) will load$")
    public void userClicksOnHelpThenHelpScreenHttpsUtilitaCoUkHelpWillLoad() {
            new HelpPage().clickOnHelpButton();
    }

    @When("^user clicks Manage your install$")
    public void userClicksManageYourInstall() {
            new ManageYourInstallPage().clickOnManageYourInstallBtn();

    }

    @Then("^Manage your install screen will load$")
    public void manageYourInstallScreenWillLoad() {
        Assert.assertEquals(new ManageYourInstallPage().getManageYourInstallMessage(),"Manage your Install");
    }

    @When("^user clicks ‘Installation’$")
    public void userClicksInstallation() {
            new InstallationPage().clickOnInstallationBtn();

    }

    @Then("^installing your Smart Meter screen will show$")
    public void installingYourSmartMeterScreenWillShow() {
            Assert.assertEquals(new InstallationPage().getInstallationText(),"Installing your Smart Meter");

    }

    @When("^user selects ‘Send us an email’$")
    public void userSelectsSendUsAnEmail() {
            new SendUsAnEmailPage().clickOnSendUsAnEmailButton();

    }

    @Then("^‘Manage your install’ drop down will open$")
    public void manageYourInstallDropDownWillOpen() {

    }

    @When("^user clicks ‘Have a question about your install\\?’$")
    public void userClicksHaveAQuestionAboutYourInstall() {
            new HaveAQuestionPage().clickOnHaveAQuestionButton();

    }

    @Then("^contact form will load$")
    public void contactFormWillLoad() {
        Assert.assertEquals(new HaveAQuestionPage().getContactFormMessage(),"Have a question about your install?");

    }

    @When("^user chooses ‘A question about my install’ from the ‘How can we help’ field$")
    public void userChoosesAQuestionAboutMyInstallFromTheHowCanWeHelpField() {
            new HaveAQuestionPage().selectQueAbtMyInstall();

    }

    @And("^no other details are filled out$")
    public void noOtherDetailsAreFilledOut() {

    }

    @And("^clicks Submit button$")
    public void clicksSubmitButton() {
            new HaveAQuestionPage().clickOnSubmitButton();

    }

    @Then("^error message ‘This field is required’ will show below the field ‘Title’$")
    public void errorMessageThisFieldIsRequiredWillShowBelowTheFieldTitle() {
            Assert.assertEquals(new HaveAQuestionPage().getTitleMessage(),"This field is required");

    }

    @And("^error message ‘This field is required’ will show below the field ‘First name’$")
    public void errorMessageThisFieldIsRequiredWillShowBelowTheFieldFirstName() {
            Assert.assertEquals(new HaveAQuestionPage().getFNameErrorMessage(),"This field is required");
    }

    @And("^error message ‘This field is required’ will show below the field ‘Last name’$")
    public void errorMessageThisFieldIsRequiredWillShowBelowTheFieldLastName() {
        Assert.assertEquals(new HaveAQuestionPage().getLNameErrorMessage(),"This field is required");

    }

    @And("^error message ‘This field is required’ will show below the field ‘Address (\\d+)’$")
    public void errorMessageThisFieldIsRequiredWillShowBelowTheFieldAddress(int arg0) {
        Assert.assertEquals(new HaveAQuestionPage().getAddressOneErrorMessage(),"This field is required");
    }

    @And("^error message ‘Preferred contact method’$")
    public void errorMessagePreferredContactMethod() {
        Assert.assertEquals(new HaveAQuestionPage().getPreferredContactMethodErrorMessage(),"This field is required");
    }

    @And("^error message ‘This field is required’ will show below the field ‘Your question’$")
    public void errorMessageThisFieldIsRequiredWillShowBelowTheFieldYourQuestion() {
        Assert.assertEquals(new HaveAQuestionPage().getYourQuestionErrorMessage(),"This field is required");
    }
}
