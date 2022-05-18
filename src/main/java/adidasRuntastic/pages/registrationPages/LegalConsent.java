package adidasRuntastic.pages.registrationPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import adidasRuntastic.base.PageBase;


public class LegalConsent extends PageBase {

    public LegalConsent(AppiumDriver driver) {
        super(driver);
    }

    private By extraLegalConsent1 = By.id("com.runtastic.android.results.lite:id/dataTransferSelection");
    private By extraLegalConsent2 = By.id("com.runtastic.android.results.lite:id/tosSelection");
    private By extraLegalConsent3 = By.id("com.runtastic.android.results.lite:id/privacyPolicySelection");
    private By consentBtn = By.id("com.runtastic.android.results.lite:id/consentButton");
    private By marketingConsent = By.id("com.runtastic.android.results.lite:id/primaryButton");

    public void setExtraLegalConsent1(){
        click(extraLegalConsent1);
    }

    public void setExtraLegalConsent2(){
        click(extraLegalConsent2);
    }

    public void setExtraLegalConsent3(){
        click(extraLegalConsent3);
    }

    public void setConsentBtn(){
        click(consentBtn);
    }

    public void setMarketingConsent(){

        click(marketingConsent);
    }

}
