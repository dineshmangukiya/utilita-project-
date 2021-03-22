$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/uk/co/utilita/resources/featurefiles/installation.feature");
formatter.feature({
  "line": 1,
  "name": "Installation functionality",
  "description": "As a user\r\nI want to visit utilita help page",
  "id": "installation-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14338897800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should able to visit utilita help page",
  "description": "",
  "id": "installation-functionality;user-should-able-to-visit-utilita-help-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on the utilita website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Help Then Help screen (https://utilita.co.uk/help) will load",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user clicks Manage your install",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Manage your install screen will load",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user clicks ‘Installation’",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "installing your Smart Meter screen will show",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user selects ‘Send us an email’",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "‘Manage your install’ drop down will open",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user clicks ‘Have a question about your install?’",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "contact form will load",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user chooses ‘A question about my install’ from the ‘How can we help’ field",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "no other details are filled out",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "clicks Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "error message ‘This field is required’ will show below the field ‘Title’",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "error message ‘This field is required’ will show below the field ‘First name’",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "error message ‘This field is required’ will show below the field ‘Last name’",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "error message ‘This field is required’ will show below the field ‘Address 1’",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "error message ‘Preferred contact method’",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "error message ‘This field is required’ will show below the field ‘Your question’",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheUtilitaWebsite()"
});
formatter.result({
  "duration": 256574200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClicksOnHelpThenHelpScreenHttpsUtilitaCoUkHelpWillLoad()"
});
formatter.result({
  "duration": 23400937400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClicksManageYourInstall()"
});
formatter.result({
  "duration": 22237807800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.manageYourInstallScreenWillLoad()"
});
formatter.result({
  "duration": 91395100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClicksInstallation()"
});
formatter.result({
  "duration": 2368548700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.installingYourSmartMeterScreenWillShow()"
});
formatter.result({
  "duration": 147692300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userSelectsSendUsAnEmail()"
});
formatter.result({
  "duration": 332712600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.manageYourInstallDropDownWillOpen()"
});
formatter.result({
  "duration": 33400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClicksHaveAQuestionAboutYourInstall()"
});
formatter.result({
  "duration": 22607394500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.contactFormWillLoad()"
});
formatter.result({
  "duration": 97623500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userChoosesAQuestionAboutMyInstallFromTheHowCanWeHelpField()"
});
formatter.result({
  "duration": 213598400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.noOtherDetailsAreFilledOut()"
});
formatter.result({
  "duration": 36600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.clicksSubmitButton()"
});
formatter.result({
  "duration": 542818300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.errorMessageThisFieldIsRequiredWillShowBelowTheFieldTitle()"
});
formatter.result({
  "duration": 97940900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.errorMessageThisFieldIsRequiredWillShowBelowTheFieldFirstName()"
});
formatter.result({
  "duration": 141153000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.errorMessageThisFieldIsRequiredWillShowBelowTheFieldLastName()"
});
formatter.result({
  "duration": 88839500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 74
    }
  ],
  "location": "MyStepdefs.errorMessageThisFieldIsRequiredWillShowBelowTheFieldAddress(int)"
});
formatter.result({
  "duration": 92441800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.errorMessagePreferredContactMethod()"
});
formatter.result({
  "duration": 93070900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.errorMessageThisFieldIsRequiredWillShowBelowTheFieldYourQuestion()"
});
formatter.result({
  "duration": 89864200,
  "status": "passed"
});
formatter.after({
  "duration": 1086688200,
  "status": "passed"
});
});