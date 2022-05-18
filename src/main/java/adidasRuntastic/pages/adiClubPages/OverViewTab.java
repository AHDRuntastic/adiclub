package adidasRuntastic.pages.adiClubPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import adidasRuntastic.base.PageBase;

public class OverViewTab extends PageBase {

    WebDriverWait wait;

    public OverViewTab(AppiumDriver driver) {
        super(driver);
    }

    //Elements for user details in overview tab
    private By levelTxt = By.id("com.runtastic.android.results.lite:id/currentLevel");
    private By progressBar = By.id("com.runtastic.android.results.lite:id/levelProgress");
    private By nextLevelTxt = By.id("com.runtastic.android.results.lite:id/pointsToNextLevel");

    //Elements for adiClub Pass
    private By adiClubPassBtn = By.id("com.runtastic.android.results.lite:id/passViewTitle");



    public String setLevelTxt(){

        return getText(levelTxt);
    }

    public boolean setProgressBar(){

       return isExist(progressBar);
    }

    public boolean setNextLevelTxt(){

        return isExist(nextLevelTxt);
    }

    public boolean setAdiClubPassBtn1(){
        return isExist(adiClubPassBtn);
    }

    public void setAdiClubPassBtn2(){

        click(adiClubPassBtn);
    }

}
