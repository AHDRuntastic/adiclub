package cucumber.stepDefinitions;

import adidasRuntastic.pages.adiClubPages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.Reporter;
import adidasRuntastic.pages.registrationPages.LegalConsent;
import adidasRuntastic.pages.registrationPages.MoreTab;
import adidasRuntastic.pages.registrationPages.OnBoarding;
import adidasRuntastic.pages.registrationPages.Registration;
import adidasRuntastic.base.TestBase;
import java.io.IOException;
import java.net.MalformedURLException;

public class AdiClub extends TestBase {

    Registration registration;
    LegalConsent legalConsent;
    OnBoarding onBoarding;
    MoreTab moreTab;
    OverViewTab overViewTab;
    AdiClubPass adiClubPass ;
    EarnPoints earnPoints;
    Levels levels;
    History history;

    public void definingObj(){
        registration = new Registration(driver);
        legalConsent = new LegalConsent(driver);
        onBoarding = new OnBoarding(driver);
        moreTab = new MoreTab(driver);
        overViewTab = new OverViewTab(driver);
        adiClubPass = new AdiClubPass(driver);
        earnPoints = new EarnPoints(driver);
        levels = new Levels(driver);
        history = new History(driver);

    }


    @Given("The user is registered using correct {string}, {string}, {string}, {string} and AdiClub country")
    public void theUserIsRegisteredUsingCorrectAndAdiClubCountry(String FirstName, String LastName, String Email, String Password) throws IOException {
        definingObj();

        registration.setJourneyBtn();
        registration.setSignupBtn();
        registration.setFName(FirstName);
        registration.setlName(LastName);
        registration.setEmail(Email);
        registration.setPassword(Password);
        registration.setBirthdate();
        registration.setJoinBtn();

    }

    @And("The user accepted legal consent")
    public void theUserAcceptLegalConsent() {
        legalConsent.setExtraLegalConsent1();
        legalConsent.setExtraLegalConsent2();
        legalConsent.setExtraLegalConsent3();
        legalConsent.setConsentBtn();
        legalConsent.setMarketingConsent();
    }

    @And("The user finished the on-boarding")
    public void theUserFinishedTheOnBoarding() {
        onBoarding.setOnBoardingBtn1();
        onBoarding.setOnBoardingBtn2();
        onBoarding.setOnBoardingBtn3();
        onBoarding.setSkipTP();
    }

    @When("The user opens the more tab")
    public void theUserOpenMoreTab() {
        moreTab.setMoreTab();
    }

    @Then("The AdiClub card is shown in more tab")
    public void theAdiClubIsShownSuccessfully() {
        String AdiClubActual = moreTab.getAdiClub();
        String ExpectedResult1 = "ADICLUB";
        Assert.assertEquals(AdiClubActual, ExpectedResult1);
        Reporter.log("The AdiClub feature is shown successfully");

        String levelActual = moreTab.getLevelOne();
        String ExpectedResult2 = "LEVEL 1";
        Assert.assertEquals(levelActual, ExpectedResult2);
        Reporter.log("The user's level is shown successfully");
    }

    @Given("The adiClub card is shown in the more tab")
    public void theAdiClubIsShownInMoreTab() throws MalformedURLException, InterruptedException {
        definingObj();

        onBoarding.setOnBoardingBtn1();
        onBoarding.setOnBoardingBtn2();
        onBoarding.setOnBoardingBtn3();
        onBoarding.setSkipTP();
        Thread.sleep(7000);
        moreTab.setMoreTab();

    }

    @When("The user taps on the show more option")
    public void theUserTapOnShowMoreOption() {
        moreTab.setShowMoreBtn();
    }

    @Then("The user details are shown in the overview tab")
    public void theUserDetailsAreShownSuccessfullyInOverviewTab() {
        String level1Actual = overViewTab.setLevelTxt();
        String ExpectedResult1 = "LEVEL 1";
        Assert.assertEquals(level1Actual, ExpectedResult1);
        Reporter.log("The user's level is shown successfully");

        Assert.assertEquals(overViewTab.setProgressBar(),true);
        Assert.assertEquals(overViewTab.setNextLevelTxt(),true);

    }

    @Given("The user is in the overview tab of AdiClub screen")
    public void theUserInTheOverviewTabOfAdiClub() throws InterruptedException {
        definingObj();

        onBoarding.setOnBoardingBtn1();
        onBoarding.setOnBoardingBtn2();
        onBoarding.setOnBoardingBtn3();
        onBoarding.setSkipTP();
        Thread.sleep(6000);
        moreTab.setMoreTab();
        moreTab.setShowMoreBtn();

        overViewTab.setLevelTxt();
    }

    @And("The adiClub pass entry point is shown")
    public void theAdiClubPassIsShownSuccessfully() {

        Assert.assertEquals(overViewTab.setAdiClubPassBtn1(),true);
    }

    @When("The user taps on adiClub pass entry point")
    public void theUserTapOnAdiClubPassOption() {
        overViewTab.setAdiClubPassBtn2();

        String myAdiPassActual = adiClubPass.setMyAdiClubTxt();
        String ExpectedResult2 = "MY ADICLUB PASS";
        Assert.assertEquals(myAdiPassActual, ExpectedResult2);

        adiClubPass.setGotItBtn();
    }

    @Then("User details are shown in the adiClub")
    public void userDetailsAreShownSuccessfullyInAdiClubPass() {
        String level1Actual = adiClubPass.setLevelTxt();
        String ExpectedResult2 = "LEVEL 1";
        Assert.assertEquals(level1Actual, ExpectedResult2);
    }

    @And("The Bar code is shown")
    public void barCodeIsShownSuccessfully() {

        Assert.assertEquals(adiClubPass.setBarCode(),true);
    }

    @And("The info screen can be viewed")
    public void theInfoScreenCanBeViewedSuccessfully() {
        adiClubPass.setInfoScreenBtn();

        String myAdiPassActual = adiClubPass.setMyAdiClubTxt();
        String ExpectedResult2 = "MY ADICLUB PASS";
        //String ExpectedResult2 = "MY ADICLUB";
        Assert.assertEquals(myAdiPassActual, ExpectedResult2);

        adiClubPass.setGotItBtn();
        adiClubPass.setBackBtn();

    }

    @And("The How to earn points entry point is shown")
    public void theIsShownSuccessfully() {

        String earnPointActual =  earnPoints.setEarnPoints1();
        String ExpectedResult = "How to Earn Points";
        Assert.assertEquals(earnPointActual,ExpectedResult);
    }

    @When("The user taps on how to earn points entry point")
    public void theUserTapOnHowToEarnPointsOption() {
        earnPoints.setEarnPoints2();
    }

    @Then("The how to earn points screen is shown")
    public void theHowToEarnPointsScreenIsShownSuccessfully() {
        String earnPointActual =  earnPoints.setEarnPointsPage();
        String ExpectedResult = "HOW TO EARN POINTS";
        Assert.assertEquals(earnPointActual,ExpectedResult);
        earnPoints.setEarnPointBack();

    }

    @When("The user scroll down in the adiClub overview screen")
    public void theUserScrollDownInTheAdiClubOverviewScreen() {

        String levelHeaderActual =  levels.setLevelHeader();
        String ExpectedResult = "LEVELS";
        Assert.assertEquals(levelHeaderActual,ExpectedResult);

    }

    @Then("The user can see the current level is unlocked")
    public void theUserCanSeeTheCurrentLevelIsUnlocked() {
        String currentLevelActual =  levels.setUnlocked();
        String ExpectedResult = "Unlocked";
        Assert.assertEquals(currentLevelActual,ExpectedResult);
    }

    @And("the user can view the level details")
    public void theUserCanViewTheLevelDetailsSuccessfully() {
        levels.setLevelSwipe();
        levels.setLockedBtn();
    }

    @And("The user can see the higher levels are locked")
    public void theUserCanSeeTheHigherLevelIsLocked() {
        String lockedActual =  levels.setLockedTxt();
        String ExpectedResult = "LOCKED";
        Assert.assertEquals(lockedActual,ExpectedResult);
        levels.setBackBtnLevel();

    }

    @Given("The new registered user in the overview tab of AdiClub")
    public void theNewRegisteredUserInTheOverviewTabOfAdiClub() throws InterruptedException {
        definingObj();

        onBoarding.setOnBoardingBtn1();
        onBoarding.setOnBoardingBtn2();
        onBoarding.setOnBoardingBtn3();
        onBoarding.setSkipTP();
        Thread.sleep(6000);
        moreTab.setMoreTab();
        moreTab.setShowMoreBtn();

    }

    @When("The user tap on the history tab")
    public void theUserTapOnTheHistoryTab() {
        history.setHistoryTab();
    }

    @Then("The user can see the joined adiClub points in the history tab")
    public void theUserCanSeeTheJoinedAdiClubPointsSuccessfullyInHistoryTab() throws IOException {
        String historyActual =  history.setHistoryData();
        String ExpectedResult = "Joined adiClub";
        Assert.assertEquals(historyActual,ExpectedResult);

    }
}
