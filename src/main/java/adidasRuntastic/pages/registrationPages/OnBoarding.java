package adidasRuntastic.pages.registrationPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import adidasRuntastic.base.PageBase;

public class OnBoarding extends PageBase {

    public OnBoarding(AppiumDriver driver) {
        super(driver);
    }


    private By onBoardingBtn = By.id("com.runtastic.android.results.lite:id/questionnaireContinueCta");
    private By skipTP = By.id("com.runtastic.android.results.lite:id/onboardingSuggestedPlanSkipOption");

    public void setOnBoardingBtn1(){

        click(onBoardingBtn);
    }

    public void setOnBoardingBtn2(){
        click(onBoardingBtn);
    }

    public void setOnBoardingBtn3(){
        click(onBoardingBtn);
    }

    public void setSkipTP(){

        click(skipTP);
    }


}
